/**
 * Class represents a vehicle (like for a car dealership). Includes attributes of a vehicle like
 * it's ID number, make/model, color, odometer reading, and price.
 *
 * @author Ravi Spigner
 */
public class Vehicle {
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle() {
        this.vehicleID = 0L;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0.0f;
    }

    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Vehicle ID: " + vehicleID +
                ", Make/Model: " + makeModel +
                ", Color: "+  color + ", Odometer Reading: " +
                odometerReading + ", Price: $" +
                price+".");
    }
}
