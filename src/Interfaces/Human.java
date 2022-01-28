package Interfaces;

public class Human implements Prey,Predator{


    @Override
    public void attack() {
        System.out.println("The human attacks it's prey.");
    }

    @Override
    public void flee() {
        System.out.println("The human runs to safety.");
    }
}
