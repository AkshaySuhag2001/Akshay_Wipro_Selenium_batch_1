package wipro_train;

import java.util.Scanner;

class Vehicle {
    public void speed() {
        System.out.println("Speed is above 80.");
    }
}

class Car extends Vehicle {
    int carTire;

    public void inputTires() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of car tires: ");
        carTire = sc.nextInt();
    }

    public void displayTires() {
        System.out.println("Car tires: " + carTire);
    }
}

class Truck extends Vehicle {
    int truckTire;

    public void inputTires() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of truck tires: ");
        truckTire = sc.nextInt();
    }

    public void displayTires() {
        System.out.println("Truck tires: " + truckTire);
    }
}

class Bike extends Vehicle {
    int bikeTire;

    public void inputTires() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bike tires: ");
        bikeTire = sc.nextInt();
    }

    public void displayTires() {
        System.out.println("Bike tires: " + bikeTire);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Bike bike = new Bike();

        car.inputTires();
        truck.inputTires();
        bike.inputTires();

        System.out.println("\n--- Tire Details ---");
        car.displayTires();
        truck.displayTires();
        bike.displayTires();

        System.out.println("\n--- Speed Info ---");
        car.speed();
        truck.speed();
        bike.speed();
    }
}
