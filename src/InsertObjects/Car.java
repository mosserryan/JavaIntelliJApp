package InsertObjects;

public class Car {

    String color;
    int year;
    String make;
    String model;

    Car(String color, int year, String make, String model) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public String toString() {

        return "A " + this.color + " " + this.year + " " + this.make + " " + this.model + ".";

    }

}
