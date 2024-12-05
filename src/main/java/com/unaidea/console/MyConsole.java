/**
 * The myConsole class attempts to facilitate interaction with the console.
 *
 * @author Jose Carranza
 * @since 1.0
 */


package com.unaidea.console;

import java.util.Scanner;
import java.util.function.Function;

public class MyConsole {
    Scanner scanner = new Scanner(System.in);

    /**
     * Method to clean the console, it works on linux and windows.
     */

    public void clean() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to print a message on the console.
     *
     * @param message The function receives a message and prints it in the console.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method to print multiple messages in the console.
     *
     * @param messages The function receives an array of messages and prints them in the console.
     */

    public void printMessage(String[] messages) {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    public <T> T getInput(String message, Function<String, T> parser) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();
                return parser.apply(input);
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}
