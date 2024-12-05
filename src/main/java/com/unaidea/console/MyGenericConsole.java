package com.unaidea.console;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class MyGenericConsole {
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

    public <T> MyGenericConsole print(T value) {
        System.out.println(value);
        return this;
    }
}
