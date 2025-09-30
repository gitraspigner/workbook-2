package com.pluralsight;

import java.util.Scanner;

/**
 * Displays a properly formatted address for an outgoing order which includes their name,
 * shipping address, and billing address given input from the user.
 *
 * @author Ravi Spigner
 */
public class AddressBuilder {
    public static void main(String[] args) {
        //get customer input for order
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.print("Billing Zip: ");
        int billingZip = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        int shippingZip = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        //display full customer info for order
        System.out.println(buildFullInfo(fullName, buildAnAddress(true, billingStreet, billingCity,
                billingState, billingZip), buildAnAddress(false, shippingStreet, shippingCity,
                shippingState, shippingZip)));
    }

    public static String buildAnAddress(boolean isBilling, String street, String city,
                                        String state, int zip) {
        StringBuilder address = new StringBuilder();
        if (isBilling) {
            address.append("Billing Address:\n");
            address.append(street).append("\n");
            address.append(city).append(", ").append(state).append(" ").append(zip).append("\n");
        } else {
            address.append("Shipping Address:\n");
            address.append(street).append("\n");
            address.append(city).append(", ").append(state).append(" ").append(zip);
        }
        return address.toString();
    }

    public static String buildFullInfo(String name, String billingAddress,
                                                  String shippingAddress) {
        //intelliJ suggests that fullInfo could be a String, but instead will continue
        //to use StringBuilder for the sake of learning it being the focus of this assignment
        StringBuilder fullInfo = new StringBuilder();
        fullInfo.append(name).append("\n").append("\n");
        fullInfo.append(billingAddress).append("\n");
        fullInfo.append(shippingAddress);
        return fullInfo.toString();
    }
}