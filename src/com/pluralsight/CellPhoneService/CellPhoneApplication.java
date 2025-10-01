package com.pluralsight.CellPhoneService;

import java.util.Scanner;

/**
 * Tests CellPhone.java by asking for user input to populate CellPhone data and then
 * displaying them to the user.
 *
 * @author Ravi Spigner
 */
public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone newPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        int serialNumber;
        String model, carrier, phoneNumber, owner;

        System.out.print("What is the serial number?: ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What model is the phone?: ");
        model = scanner.nextLine();
        System.out.print("Who is the carrier?: ");
        carrier = scanner.nextLine();
        System.out.print("What is the phone number?: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone?: ");
        owner = scanner.nextLine();

        newPhone.setSerialNumber(serialNumber);
        newPhone.setModel(model);
        newPhone.setCarrier(carrier);
        newPhone.setPhoneNumber(phoneNumber);
        newPhone.setOwner(owner);

        System.out.println();
        System.out.println("Ok, here are this phone's details: ");
        System.out.println("Serial Number: " + newPhone.getSerialNumber());
        System.out.println("Model: " + newPhone.getModel());
        System.out.println("Carrier: " + newPhone.getCarrier());
        System.out.println("Phone Number: " + newPhone.getPhoneNumber());
        System.out.println("Owner: " + newPhone.getOwner());
    }
}