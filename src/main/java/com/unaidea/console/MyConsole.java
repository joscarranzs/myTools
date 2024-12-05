package com.unaidea.console;

public class MyConsole {
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
}
