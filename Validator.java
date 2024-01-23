/*
Assignment Number: 1
Assignment Title: Date to Words Converter
Program Author: Steve Defendre
date due: 01/22/2024
*/

import java.util.Scanner;

public class Validator {
    // Scanner object for reading user input
    public static Scanner sc = new Scanner(System.in);

    // Method to get a non-empty string input from the user
    public static String getString(Scanner sc, String prompt) {
        String s;
        do {
            System.out.print(prompt);
            s = sc.nextLine();  // Read user entry
            if (s.equals("")) {
                System.out.println("Error! String cannot be left blank.");
            }
        } while (s.equals(""));  // Repeat until a non-empty string is entered

        return s;
    }

    // Method to get a valid integer from the user
    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // Discard any other data entered on the line
        }
        return i;
    }

    // Method to get an integer within a specific range
    public static int getInt(Scanner sc, String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Error! Number must be greater than " + min + ".");
            } else if (i > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    // Method to get a valid double from the user
    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // Discard any other data entered on the line
        }
        return d;
    }

    // Method to get a double within a specific range
    public static double getDouble(Scanner sc, String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(sc, prompt);
            if (d < min) {
                System.out.println("Error! Number must be greater than " + min + ".");
            } else if (d > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}
