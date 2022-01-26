package AbstractKeyword;

public class Main {

    public static void main(String[] args) {

        // abstract: Abstract classes cannot be instantiated, but can have subclasses.
        //           Abstract methods are declared without an implementation.
        //           (Adds a layer of security to program.)

        // Vehicle vehicle = new Vehicle(); cannot happen because it is an "abstract" class.

        Car car = new Car("Subaru", "Forester", 4, 4, "White", 2016, "Good");


        car.carSpecs();

    }

}
