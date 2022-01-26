package ClassInheritance;

public class Vehicle {

    double speed;
    boolean moving = false;

      void drive() {

        System.out.println("You begin to move forward.");
        moving = true;
        speed = 5.0;


    }

     void stop() {

        System.out.println("You come to a stop.");
        speed = 0.0;
        moving = false;

    }

}
