package ClassInheritance;

public class Main {

    public static void main(String[] args) {

        Car carOne = new Car();

        carOne.drive();
        System.out.println(carOne.speed);
        System.out.println(carOne.wheels);

        Bike bikeOne = new Bike();

        bikeOne.drive();
        System.out.println(bikeOne.wheels);
        System.out.println(bikeOne.speed);

    }





}
