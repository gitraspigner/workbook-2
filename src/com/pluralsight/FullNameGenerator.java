package com.pluralsight;

import java.util.Scanner;

/**
 * Displays a formatted full name given user input including first name, middle name, last name,
 * and suffix.
 *
 * @author Ravi Spigner
 */
public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String abbreviatedMiddleName = "";
        if (!middleName.isEmpty()) {
            abbreviatedMiddleName = middleName.charAt(0) + ".";
        }
        String suffixWithComma = "";
        if (!suffix.isEmpty()) {
            suffixWithComma = ", " + suffix;
        }

        System.out.println(("Full Name: " + firstName + " " + abbreviatedMiddleName +
                " " + lastName + suffixWithComma).replaceAll("  ", " "));
        scanner.close();
    }
}