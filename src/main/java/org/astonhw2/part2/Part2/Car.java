package org.astonhw2.part2.Part2;

import jakarta.persistence.*;


@Entity
@Table(name = "Car")
public class Car extends Vehicle {


    @Id
    private String color;
    private int mileage;
    @Column(name = "num_Doors")
    private int numDoors;


    public Car(int id, String manufacturer, String model, int year, double price, String color, int mileage, int numDoors) {
        super(id, manufacturer, model, year, price);
        this.color = color;
        this.mileage = mileage;
        this.numDoors = numDoors;
    }

    public Car() {

    }

    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " miles");
        System.out.println("num_Doors: " + numDoors);
    }
}
