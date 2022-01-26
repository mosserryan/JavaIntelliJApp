package AbstractKeyword;

public abstract class Vehicle {

    int door;
    int tires;
    String condition;
    int year;
    String color;

    Vehicle(int door, int tires, String condition, int year, String color) {

        this.door = door;
        this.tires = tires;
        this.condition = condition;
        this.year = year;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "door=" + door +
                ", tires=" + tires +
                ", condition='" + condition + '\'' +
                ", year=" + year +
                ", color='" + color + '\'';
    }

    abstract void go();


}
