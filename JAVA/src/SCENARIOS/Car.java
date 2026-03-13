package SCENARIOS;

public class Car extends Vehicle {

    int doors;

    void showCarInfo() {
        System.out.println("Number of doors: " + doors);
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Toyota";   // inherited variable
        c.speed = 120;        // inherited variable
        c.doors = 4;

        c.start();            // inherited method
        c.display();          // inherited method
        c.showCarInfo();      // child method
    }
}