package Excercise3;

import java.util.Scanner;

public class Client {
    private String name;
    private Service service;

    public Client(Service service, String name) {
        this.name = name;
        this.service = service;
    }

    public void bookService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The distance is:");
        double distance = sc.nextDouble();
        boolean validInput = false;
        double cost = 0;
        while (!validInput) {
            System.out.println("The type of service is:");
            String serviceType = sc.nextLine();
            if (serviceType.equalsIgnoreCase("food delivery")) {
                cost = 2 * distance;
                validInput = true;
            } else if (serviceType.equalsIgnoreCase("express delivery")) {
                cost = 4 * distance;
                validInput = true;
            } else
                System.out.println("Invalid input!");
        }
        service.setDistance(distance);
        service.setCost(cost);
        service.setStatus("booked");
        System.out.printf("The distance is: %f, the cost is %f\n",service.getDistance(), service.getCost());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
