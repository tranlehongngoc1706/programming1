package Excercise3;


public class Driver {
    private String name;
    private double wallet;

    public Driver(String name) {
        this.name = name;
        this.wallet = 0;
    }

    public Driver(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void acceptDelivery() {
    }

    public void completesDelivery() {

    }

    // Can accept a delivery service to which is already booked by a client.
    // When the driver accepts a delivery, the status of that service becomes delivering.
    // When the driver completes a delivery, the status of that service becomes delivered.
    // After that, the cost of that completed delivery will be credited to the wallet of that driver.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
