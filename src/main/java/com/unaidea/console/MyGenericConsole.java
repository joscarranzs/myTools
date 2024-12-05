package com.unaidea.console;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class MyGenericConsole {
    private boolean clearPending = false;
    public MyGenericConsole clear() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public MyGenericConsole clearLine() {
        clearPending = true;
        return this;
    }

    public <T> MyGenericConsole print(T value) {
        if (clearPending) {
            try {
                if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearPending = false;
        }

        System.out.println(value);
        return this;
    }
}
