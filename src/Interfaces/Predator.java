package Interfaces;

public interface Predator {

    void attack();
    default void eatPrey() {
        System.out.println("yummy");
    }



}
