package ClassInheritance;

public class Car extends Vehicle {

    int wheels = 4;

    @Override
    void drive() {
        super.drive();
        speed = 10.0;
        System.out.println(moving);
    }
}
