package com.unaidea.console;

import java.io.FilterOutputStream;

/**
 * The {@code Output} class extends {@code FilterOutputStream} to provide 
 * a simple utility for printing various data types to the console.
 * 
 * This class handles potential exceptions during printing and ensures 
 * the output stream is properly flushed and closed when required.
 * 
 * Author: Jose Carranza
 */
public class Output extends FilterOutputStream {

    /**
     * Constructs a new {@code Output} instance that writes to {@code System.out}.
     */
    public Output() { 
        super(System.out); 
    }

    /**
     * Flushes and closes the output stream.
     * If an exception occurs during the closing process, it logs an error message.
     */
    @Override
    public void close() {
        try {
            flush();
            super.close();
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes an integer value to the output stream followed by a newline.
     * 
     * @param value the integer value to print
     */
    public void print(int value) {
        try {
            this.write(String.valueOf(value).getBytes());
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes a float value to the output stream followed by a newline.
     * 
     * @param value the float value to print
     */
    public void print(float value) {
        try {
            this.write(String.valueOf(value).getBytes());
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes a double value to the output stream followed by a newline.
     * 
     * @param value the double value to print
     */
    public void print(double value) {
        try {
            this.write(String.valueOf(value).getBytes());
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes a boolean value to the output stream followed by a newline.
     * 
     * @param value the boolean value to print
     */
    public void print(boolean value) {
        try {
            this.write(String.valueOf(value).getBytes());
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes a single character to the output stream followed by a newline.
     * 
     * @param value the character to print
     */
    public void print(char value) {
        try {
            this.write(String.valueOf(value).getBytes());
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes the given string to the output stream, followed by a newline.
     * 
     * If the string is {@code null}, the literal string "null" is written 
     * to the output stream instead.
     * 
     * This method ensures that no {@code NullPointerException} occurs 
     * when attempting to write a {@code null} value. If an exception occurs 
     * during the writing process, it logs an error message and prints the 
     * stack trace to the console.
     * 
     * @param value the string to be printed. If {@code null}, the string "null" 
     *              will be written to the output stream.
     */
    public void print(String value) {
        try {
            if (value == null) {
                this.write("null".getBytes());
            } else {
                this.write(value.getBytes());
            }
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Writes the string representation of the given object to the output stream, 
     * followed by a newline.
     * 
     * This method uses {@code String.valueOf(value)} to convert the object to 
     * a string. If the object is {@code null}, it prints "null". The output is 
     * written as bytes.
     * 
     * If an exception occurs during the writing process, an error message is logged, 
     * and the stack trace is printed to the console.
     * 
     * @param value the object to be printed. If {@code null}, the string "null" 
     *              will be written to the output stream.
     */
    public void print(Object value) {
        try {
            if (value == null) {
                this.write("null".getBytes());
            } else {
                this.write(String.valueOf(value).getBytes());
            }
            this.write("\n".getBytes());
        } catch (Exception e) {
            System.out.println("[ERROR]: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
