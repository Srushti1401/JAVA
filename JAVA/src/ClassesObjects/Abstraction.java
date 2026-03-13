package ClassesObjects;

abstract class Ride{

    abstract double calculateFare(double distance);
}

class BikeRide extends Ride{
    double calculateFare(double distance){
        return distance*5;
    }
}

class CarRide extends Ride{
    double calculateFare(double distance){
        return distance*10;
    }
}

public class Abstraction{
    public static void main(String[] args){

        Ride r1=new BikeRide();
        Ride r2=new CarRide();

        System.out.println(r1.calculateFare(10));
        System.out.println(r2.calculateFare(10));
    }
}