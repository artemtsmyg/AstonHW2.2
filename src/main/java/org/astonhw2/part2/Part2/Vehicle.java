package org.astonhw2.part2.Part2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int id;
    protected String manufacturer;
    protected String model;
    protected int year;
    protected double price;

    public Vehicle(int id, String manufacturer, String model, int year, double price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public abstract void displayInfo();
}

