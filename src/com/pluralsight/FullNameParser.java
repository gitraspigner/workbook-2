package com.pluralsight;

import java.util.Scanner;

/**
 * Displays parts of a full name (first and last name which can include a middle name)
 * given a full name (of the entered format: First Last   OR   First Middle Last).
 *
 * @author Ravi Spigner
 */
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry Format: First Last   OR   First Middle Last");
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();
        //instead of using regex: " " in .split(" ");
        // let's use the regex: "\\s+" below to catch any amount of spaces
        String[] names = fullName.split("\\s+");
        String firstName = "";
        String middleName = "";
        String lastName = "";
        if (names.length == 2) {
            firstName = names[0];
            lastName = names[1];
        } else if (names.length == 3) {
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
        } else {
            System.out.println("Invalid input, please enter a full name in the format of:");
            System.out.println("First Last     OR     First Middle Last");
            System.out.println("the next time that you run this program.");
            return;
        }

        System.out.println("First name: " + firstName);
        if (!middleName.isEmpty()) {
            System.out.println("Middle Name: " + middleName.charAt(0) + ".");
        }
        System.out.println("Last name: " + lastName);
        scanner.close();
        //test string:
        //    Jane        Thomas      Doe
    }
}