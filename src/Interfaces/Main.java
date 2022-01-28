package Interfaces;

public class Main {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.attack();

        Human human = new Human();
        human.flee();
        human.attack();


    }

}
