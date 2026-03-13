package SCENARIOS;

public class Vehicle {

    String brand;
    int speed;

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
