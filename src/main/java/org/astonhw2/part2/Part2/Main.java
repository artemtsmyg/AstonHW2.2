package org.astonhw2.part2.Part2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Lada", "Largus", 2016, 10000, "Silver", 1000, 20000);
        car.displayInfo();


        System.out.println();

        Motorcycle motorcycle = new Motorcycle(1, "Harley-Davidson", "Sportster", 2020, 12000, "Sport", 1200);
        motorcycle.displayInfo();


    }
}
