package com.pluralsight.CellPhoneService;

//import java.util.Scanner;

/**
 * Tests CellPhone.java by asking for user input to populate CellPhone data and then
 * displaying them to the user.
 *
 * @author Ravi Spigner
 */
public class CellPhoneApplication {
    public static void main(String[] args) {
        //Scanner tests:
        /**
         * CellPhone newPhone1 = new CellPhone();
         * Scanner scanner = new Scanner(System.in);
         * int serialNumber;
         * String model, carrier, phoneNumber, owner;
         * System.out.print("What is the serial number?: ");
         * serialNumber = scanner.nextInt();
         * scanner.nextLine();
         * System.out.print("What model is the phone?: ");
         * model = scanner.nextLine();
         * System.out.print("Who is the carrier?: ");
         * carrier = scanner.nextLine();
         * System.out.print("What is the phone number?: ");
         * phoneNumber = scanner.nextLine();
         * System.out.print("Who is the owner of the phone?: ");
         * owner = scanner.nextLine();
         * newPhone1.setSerialNumber(serialNumber);
         * newPhone1.setModel(model);
         * newPhone1.setCarrier(carrier);
         * newPhone1.setPhoneNumber(phoneNumber);
         * newPhone1.setOwner(owner);
         * System.out.println();
         */

        CellPhone newPhone2 = new CellPhone(11010101, "Samsung S24", "Verizon",
                "206-777-8889", "Carlton Banks");
        CellPhone newPhone3 = new CellPhone(11111111, "Apple iPhone 3GS", "Sprint",
                "425-847-3002", "Landon Ricketts");
        //Display tests
        display(newPhone2);
        System.out.println();
        display(newPhone3);
        System.out.println();
        //
        //Dial tests - using getPhoneNumber
        newPhone2.dial(newPhone3.getPhoneNumber());
        newPhone3.dial(newPhone2.getPhoneNumber());
        System.out.println("\n---Below output should be identical to above output (each " +
                "are different tests)---\n");
        //Dial tests - using Phone object itself
        newPhone2.dial(newPhone3);
        newPhone3.dial(newPhone2);
    }

    public static void display(CellPhone phone) {
        System.out.println("Cell Phone details for " + phone.getOwner() + "'s phone:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
