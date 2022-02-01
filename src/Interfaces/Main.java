package Interfaces;

// Interface: a template that can be applied to a class.
//            similar to inheritance, but specifies what a class has/must do.
//            classes can apply more than one interface, inheritance is limited to one super.

public class Main {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        rabbit.jump();

        Hawk hawk = new Hawk();
        hawk.attack();
        hawk.eatPrey();

        Human human = new Human();
        human.flee();
        human.attack();

    }

}
