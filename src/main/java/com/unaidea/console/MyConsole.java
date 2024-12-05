/**
 * The myConsole class attempts to facilitate interaction with the console.
 *
 * @author Jose Carranza
 * @since 1.0
 */


package com.unaidea.console;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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

    /**
     * Method to print a collection of any type in the console.
     *
     * @param message The function receives a message and prints it in the console.
     */

    public <T> void printMessage(String message, List<T> list) {
        System.out.println(message);
        for (T element : list) {
            System.out.print(element + " ");
        }
    }

    /**
     * Method for any type of console input.
     *
     * @param message The function receives a message and prints it in the console.
     * @param parser  The function receives a string and returns a type.
     * @return The method returns a type T.
     */

    public <T> T getInput(String message, Function<String, T> parser) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();
                return parser.apply(input);
            } catch (Exception e) {
                System.out.println("Invalid input. " + e.getMessage());
            }
        }
    }

    /**
     * Method for input of any type for a console array.
     *
     * @param message The function receives a message and prints it in the console.
     * @param parser  The function receives a string and returns a type.
     * @return The method returns a list of types T.
     */

    public <T> List<T> getArrayInput(String message, Function<String, T> parser) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();

                String[] parts = input.split(",\\s*");

                List<T> values = new ArrayList<>();

                for (String part : parts) {
                    values.add(parser.apply(part));
                }

                return values;
            } catch (Exception e) {
                System.out.println("Invalid input. " + e.getMessage());
            }
        }
    }
}
