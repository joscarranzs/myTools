/**
 * The myConsole class attempts to facilitate interaction with the console.
 *
 * @author Jose Carranza
 * @since 1.0
 */


package com.unaidea.console;

import java.util.Scanner;

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
     * Method to request input of an integer value.
     *
     * @return Returns the integer value entered by the user.
     */

    public int getIntegerInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer value.");
            }
        }
    }

    /**
     * Method to request input of an integer value.
     *
     * @param message The function receives a message and prints it in the console.
     * @return Returns the integer value entered by the user.
     */

    public int getIntegerInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer value.");
            }
        }
    }
}
