package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Welcome to the racing game");

        Car carReference = new Car();
        carReference.name = "Dacia";
        carReference.color = "red";
        carReference.mileage =9.80;
        carReference.fuelLevel =60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount =2;
        carReference.manufactureYear=2007;
        carReference.fuelType = "benzina";
        carReference.motorSize = 2000;
        carReference.weight=1200;
        carReference.nitrogen=false;
        carReference.esp=true;


        Car car2 = new Car();
        car2.name = "BMW";
        car2.mileage = 14;
        car2.color = null;
        car2.manufactureYear=2005;
        car2.fuelType = "motorina";
        car2.motorSize = 2500;
        car2.weight=1800;
        car2.nitrogen=true;
        car2.esp=false;


        //concatenation
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.doorCount);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.travelDistance);
        System.out.println(carReference.manufactureYear);
        System.out.println(carReference.fuelType);
        System.out.println(carReference.motorSize);


        System.out.println("Second car name: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.doorCount);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.travelDistance);
        System.out.println(car2.manufactureYear);
        System.out.println(car2.motorSize);
        System.out.println(car2.fuelType);


    }
}
