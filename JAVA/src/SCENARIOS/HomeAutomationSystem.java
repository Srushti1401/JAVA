package SCENARIOS;

import java.util.InputMismatchException;
import java.util.Scanner;

class HomeDevice {

    private int deviceId;
    private String deviceName;
    private boolean powerStatus;
    private double energyConsumption;
    private static int deviceCount = 0;

    // Constructor
    public HomeDevice(int deviceId, String deviceName, double energyConsumption) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.energyConsumption = energyConsumption;
        this.powerStatus = false;
        deviceCount++;
    }

    // Turn ON device
    public void turnOn() {

        if(powerStatus){
            System.out.println(deviceName + " is already ON");
        }
        else{
            powerStatus = true;
            System.out.println(deviceName + " turned ON");
        }
    }

    // Turn OFF device
    public void turnOff() {

        if(!powerStatus){
            System.out.println(deviceName + " was not ON. Cannot turn OFF.");
        }
        else{
            powerStatus = false;
            System.out.println(deviceName + " turned OFF");
        }
    }
    public boolean isDeviceOn() {
        return powerStatus;
    }

    // Calculate energy usage
    public double calculateEnergyUsage(float hours) {

        if(powerStatus) {
            return energyConsumption * hours;
        }
        else {
            System.out.println(deviceName + " is OFF. Energy usage = 0");
            return 0;
        }
    }

    // Show device status
    public void displayStatus() {
        System.out.println(deviceName + " Status: " + (powerStatus ? "ON" : "OFF"));
    }

    // Static method
    public static int getTotalDevices() {
        return deviceCount;
    }

    public String getDeviceName() {
        return deviceName;
    }
}

public class HomeAutomationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HomeDevice tv = new HomeDevice(101,"Television",120);
        HomeDevice ac = new HomeDevice(102,"Air Conditioner",1500);
        HomeDevice light = new HomeDevice(103,"LED Light",15);
        HomeDevice fan = new HomeDevice(104,"Fan",80);

        HomeDevice[] devices = {tv,ac,light,fan};

        int choice = 0;

        do{

            try{

                System.out.println("\n===== HOME AUTOMATION MENU =====");
                System.out.println("1. Turn ON Device");
                System.out.println("2. Turn OFF Device");
                System.out.println("3. Calculate Energy Usage");
                System.out.println("4. Show Device Status");
                System.out.println("5. Show Total Devices");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if(choice >=1 && choice <=4){

                    System.out.println("\nSelect Device:");

                    for(int i=0;i<devices.length;i++){
                        System.out.println((i+1) + ". " + devices[i].getDeviceName());
                    }

                    System.out.print("Enter device number: ");
                    int deviceChoice = sc.nextInt() - 1;

                    if(deviceChoice >=0 && deviceChoice < devices.length){

                        switch(choice){

                            case 1:
                                devices[deviceChoice].turnOn();
                                break;

                            case 2:
                                devices[deviceChoice].turnOff();
                                break;

                            case 3:

                                if(devices[deviceChoice].isDeviceOn()){

                                    System.out.print("Enter hours used: ");
                                    float hours = sc.nextFloat();

                                    double energy = devices[deviceChoice].calculateEnergyUsage(hours);

                                    System.out.println("Energy Used: " + energy + " watts");
                                }

                                else{
                                    System.out.println("Device is OFF. Please turn it ON first.");
                                }

                                break;

                            case 4:
                                devices[deviceChoice].displayStatus();
                                break;
                        }

                    }
                    else{
                        System.out.println("Invalid device selection.");
                    }
                }

                else if(choice == 5){
                    System.out.println("Total Devices Created: " + HomeDevice.getTotalDevices());
                }

                else if(choice == 6){
                    System.out.println("Exiting Home Automation System...");
                }

                else{
                    System.out.println("Invalid choice. Please select from menu.");
                }

            }

            catch(InputMismatchException e){
                System.out.println("Only numbers are allowed!");
                sc.nextLine(); // clear invalid input
            }

        }while(choice != 6);

        sc.close();
    }
}