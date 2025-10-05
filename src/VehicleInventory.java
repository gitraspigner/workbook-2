import java.util.Scanner;

/**
 * Manages the inventory (in a very basic way) for a used car dealership. Users use a menu to look
 * up vehicles (by make/model, price range, or color) or add vehicles to the inventory list.
 *
 * @author Ravi Spigner
 */
public class VehicleInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        int vehiclesAvailable = 0;
        //preload array with 6 vehicles
        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        vehiclesAvailable = 6;

        int response = 0;
        while (response != 6) {
            System.out.print("""
                    What do you want to do?
                    1 - List all vehicles
                    2 - Search by make/model
                    3 - Search by price range
                    4 - Search by color
                    5 - Add a vehicle
                    6 - Quit
                    Enter your command:\s""");
            response = scanner.nextInt();
            scanner.nextLine();

            boolean foundVehicle = false;
            System.out.println();

            switch(response) {
                case 1:
                    System.out.println("Here is a list of all of the vehicles available: ");
                    for(int i = 0; i < vehiclesAvailable; i++) {
                        vehicles[i].display();
                    }
                    break;
                case 2:
                    System.out.print("To search for vehicles by make/model, please enter the " +
                            "Make/Model: ");
                    String makeAndModel = scanner.nextLine();
                    foundVehicle = false;
                    for (int i = 0; i < vehiclesAvailable; i++) {
                        if (makeAndModel.equalsIgnoreCase(vehicles[i].getMakeModel())) {
                            foundVehicle = true;
                            System.out.println("Vehicle Found! Here is its information:");
                            vehicles[i].display();
                        }
                    }
                    if (!foundVehicle) {
                        System.out.println("Unable to find vehicle.");
                    }
                    break;
                case 3:
                    System.out.print("To search for vehicles by price range, please enter the" +
                            " lower price limit: ");
                    int lowerLimit = scanner.nextInt();
                    System.out.print("Now, please enter the upper price limit: ");
                    int upperLimit = scanner.nextInt();
                    scanner.nextLine();
                    foundVehicle = false;
                    double currentVehiclePrice;
                    for (int i = 0; i < vehiclesAvailable; i++) {
                        currentVehiclePrice = vehicles[i].getPrice();
                        if (currentVehiclePrice >= lowerLimit && currentVehiclePrice <= upperLimit) {
                            foundVehicle = true;
                            System.out.println("Vehicle Found! Here is its information:");
                            vehicles[i].display();
                        }
                    }
                    if (!foundVehicle) {
                        System.out.println("Unable to find vehicle.");
                    }
                    break;
                case 4:
                    System.out.print("To search for a vehicles by color, please enter the color " +
                            "you are searching for: ");
                    String color = scanner.nextLine();
                    foundVehicle = false;
                    for (int i = 0; i < vehiclesAvailable; i++) {
                        if (color.equalsIgnoreCase(vehicles[i].getColor())) {
                            foundVehicle = true;
                            System.out.println("Vehicle Found! Here is its information:");
                            vehicles[i].display();
                        }
                    }
                    if (!foundVehicle) {
                        System.out.println("Unable to find vehicle.");
                    }
                    break;
                case 5:
                    System.out.println("Info required for adding a new vehicle: ");
                    System.out.print("Please enter the new Vehicle ID: ");
                    long vehicleID = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Please enter the new Make/Model: ");
                    String makeModel = scanner.nextLine();

                    System.out.print("Please enter the new vehicle's color: ");
                    String newColor  = scanner.nextLine();

                    System.out.print("Please enter the new vehicle's odometer reading: ");
                    int odometerReading = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Please enter the new vehicle's price: ");
                    float price = scanner.nextFloat();
                    scanner.nextLine();

                    Vehicle newVehicle = new Vehicle(vehicleID, makeModel, newColor,
                            odometerReading, price);
                    vehicles[vehiclesAvailable] = newVehicle;
                    vehiclesAvailable++;
                    System.out.println("New Vehicle successfully added!");
                    break;
                case 6:
                    System.out.println("Thank you for running this vehicle inventory program!");
                    System.out.println("See you next time!");
                    scanner.close();
                    continue;
            }
            System.out.println();
        }
    }
}
