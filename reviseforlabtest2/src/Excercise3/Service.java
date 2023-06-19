package Excercise3;

public class Service {
    private double distance;
    private double cost;

    private String status;

    public Service() {
        this(0,0,"");
    }

    public Service(double distance, double cost, String status) {
        this.distance = distance;
        this.cost = cost;
        this.status = status;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
