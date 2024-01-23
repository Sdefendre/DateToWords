/*
Assignment Number: 1
Assignment Title: Date to Words Converter
Program Author: Steve Defendre
date due: 01/22/2024
*/

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // Prompting user to enter a date in the specified format
            String str_MM_DD_YYYY = Validator.getString(
                sc,
                "Enter date in MM/DD/YYYY format: "
            );

            // Splitting the input into date components
            String[] dateComponents = str_MM_DD_YYYY.split("/");
            if (dateComponents.length != 3) {
                System.out.println("\t\t Bad input, please retry...");
                continue;
            }

            // Parsing the date components into integers
            int month = 0;
            int day = 0;
            int year = 0;
            try {
                month = Integer.parseInt(dateComponents[0]);
                day = Integer.parseInt(dateComponents[1]);
                year = Integer.parseInt(dateComponents[2]);
            } catch (NumberFormatException ex) {
                System.out.println("\t\t Numeric values are expected, please retry...");
                continue;
            }

            // Creating a converter object and performing the conversion
            Date2TextConverter converter = new Date2TextConverter(month, day, year);

            // Displaying the converted date
            System.out.println(converter.month2text() + " " + converter.day2text() + ", " + converter.year2text());
        }
    }
}