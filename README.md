# Date to Words Converter

## Description
The Date to Words Converter is a Java application that converts dates from MM/DD/YYYY format into their word representation. This includes the English name of the month, the ordinal form of the day, and the year in a readable verbal format.

## Features
- Converts dates in MM/DD/YYYY format to words.
- Outputs the full English name of the month.
- Transforms day numbers into ordinal words (e.g., 1st, 2nd, 31st).
- Converts year into a two-part verbal representation.

## How to Run
1. Ensure Java is installed on your system.
2. Navigate to the directory containing the Java files.
3. Compile the code:
   ```bash
   javac MainApp.java Date2TextConverter.java Validator.java
Run the compiled application:
bash
Copy code
java MainApp
Enter a date in MM/DD/YYYY format when prompted.
Requirements

Java Development Kit (JDK), version 11 or newer.
Project Structure

MainApp.java: Main class for user interaction and program execution.
Date2TextConverter.java: Handles the conversion of numeric dates to their word form.
Validator.java: Validates user input.
Usage

After starting the application, input a date in the format MM/DD/YYYY. The program will then display the date in word format. For example:


Enter date in MM/DD/YYYY format: 01/22/2024
January twenty-second, twenty twenty-four
Contributions

This project is developed as part of a programming class assignment and is not currently open for external contributions.

License

This project is released under the MIT License. 