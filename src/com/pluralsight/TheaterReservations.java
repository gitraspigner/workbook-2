package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Displays theater reservation given the user input of a first and last name for the reservation,
 * the date of the reservation (of the format MM/dd/yyyy), and the number of tickets reserved.
 *
 * @author Ravi Spigner
 */
public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        String[] fullNameSplit = name.split(" ");

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("How many tickets would you like: ");
        int tickets = scanner.nextInt();

        if (tickets == 1) {
            System.out.print("1 Ticket ");
        } else {
            System.out.print(tickets + " Tickets ");
        }
        System.out.println("reserved for " + date + " under " + fullNameSplit[1] + ", " +
                fullNameSplit[0]);
        scanner.close();
        //tests:
        //Geri Johnson 05/13/2023 3
        //Geri Johnson 05/13/2023 1
    }
}