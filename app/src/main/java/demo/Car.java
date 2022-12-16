package demo;

public class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving car...");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Checking for engine temperature on start...");
    }
}