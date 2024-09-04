package org.astonhw2.part2.Part2;

import jakarta.persistence.*;


@Entity
@Table(name = "Motorcycle")
public class Motorcycle extends Vehicle {

    @Id
    private String type;
    @Column(name = "engine_Size")
    private int engineSize;


    public Motorcycle(int id, String manufacturer, String model, int year, double price, String type, int engineSize) {
        super(id, manufacturer, model, year, price);
        this.type = type;
        this.engineSize = engineSize;
    }

    public Motorcycle() {

    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Details:");
        System.out.println("ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Type: " + type);
        System.out.println("EngineSize: " + engineSize + " cc");
    }
}
