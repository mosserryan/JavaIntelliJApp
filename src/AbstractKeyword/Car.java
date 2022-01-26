package AbstractKeyword;

public class Car extends Vehicle{

    String make;
    String model;

    Car(String make, String model, int door, int tires, String color, int year, String condition) {
        super(door, tires, condition, year, color);
        this.make = make;
        this.model = model;
    }

    @Override
    void go() {
        System.out.println("The car in now driving.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    void carSpecs() {

        System.out.println(this);

    }

}
