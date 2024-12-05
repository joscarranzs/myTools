/**
 * The myConsole class attempts to facilitate interaction with the console.
 *
 * @author Jose Carranza
 * @since 1.0.1
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
     * Method that allows printing a value of any type.
     *
     * @param message The message displayed on the console.
     * @param <T>     The type of the message.
     */

    public <T> void printMessage(T message) {
        System.out.println(message);
    }

    /**
     * Method that prints an array of values of any type.
     *
     * @param message The array of messages displayed on the console.
     * @param <T>     The type of the messages.
     */

    public <T> void printMessage(T[] message) {
        for (T m : message) {
            System.out.println(m);
        }
    }


    /**
     * This method allows you to obtain a value of type int.
     *
     * @param message The message displayed on the console.
     * @return The value of type int.
     */

    public int getIntegerInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input, not an integer. ");
            }
        }
    }

    /**
     * This method allows obtaining a value of type float.
     *
     * @param message The message displayed on the console.
     * @return The value of type float.
     */

    public float getFloatInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (Exception e) {
                System.out.println("Invalid input, not a float. ");
            }
        }
    }

    /**
     * This method allows obtaining a value of type double.
     *
     * @param message The message displayed on the console.
     * @return The value of type double.
     */

    public double getDoubleInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (Exception e) {
                System.out.println("Invalid input, not a double. ");
            }
        }
    }

    /**
     * This method allows obtaining a value of type boolean.
     *
     * @param message The message displayed on the console.
     * @return The value of type boolean.
     */

    public boolean getBooleanInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();

                if (!input.equalsIgnoreCase("True") && !input.equalsIgnoreCase("False")) {
                    throw new IllegalArgumentException("Invalid input, not a boolean");
                } else {
                    return Boolean.parseBoolean(input);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * This method allows obtaining a value of type char.
     *
     * @param message The message displayed on the console.
     * @return The value of type char.
     */

    public char getCharInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();

                if (input.length() != 1) {
                    throw new IllegalArgumentException("Invalid input, not a char");
                } else {
                    return input.charAt(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * This method allows obtaining a value of type String.
     *
     * @param message The message displayed on the console.
     * @return The value of type String.
     */

    public String getStringInput(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Empty input.");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
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

    /**
     * Method to print a new line in the console.
     */

    public void newLine() {
        System.out.println();
    }

    /**
     * Method to print a new line in the console.
     *
     * @param lines The number of lines to print.
     */

    public void newLine(int lines) {
        for (int i = 0; i < lines; i++) {
            System.out.println();
        }
    }
}
