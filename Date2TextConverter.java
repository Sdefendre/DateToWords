/*
Assignment Number: 1
Assignment Title: Date to Words Converter
Program Author: Steve Defendre
date due: 01/22/2024
*/


public class Date2TextConverter {
    // Data members for storing the date components
    private int month;
    private int day;
    private int year;

    // Constructor to initialize the date components
    public Date2TextConverter(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Converts the numeric month to its full English name
    public String month2text() {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        } else {
            return "Invalid Month";
        }
    }

    // Converts the numeric day to its ordinal English representation
    public String day2text() {
        if (day >= 1 && day <= 31) {
            // Determine the appropriate ordinal suffix
            String suffix;
            switch (day) {
                case 1:
                case 21:
                case 31:
                    suffix = "st";
                    break;
                case 2:
                case 22:
                    suffix = "nd";
                    break;
                case 3:
                case 23:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
            }
            return day + suffix;
        } else {
            return "Invalid Day";
        }
    }
    

    // Converts the numeric year to its English word representation
    public String year2text() {
        int century = year / 100;
        int yearInCentury = year % 100;
        String centuryText = number2words(century);
        String yearText = number2words(yearInCentury);

        if (yearInCentury < 10) {
            return centuryText + " zero " + yearText;
        } else {
            return centuryText + " " + yearText;
        }
    }

    // Helper method to convert a number between 0 and 99 into words
    private String number2words(int number) {
        if (number < 20) {
            return zero2nineteen[number];
        } else if (number % 10 == 0) {
            return decades[number / 10 - 2];
        } else {
            return decades[number / 10 - 2] + " " + zero2nineteen[number % 10];
        }
    }

    // Arrays for number-to-word conversion
    private static final String[] zero2nineteen = {
        "zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String[] decades = {
        "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
}
