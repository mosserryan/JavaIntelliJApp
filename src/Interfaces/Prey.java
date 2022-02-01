package Interfaces;

public interface Prey {

    void flee();

    public default void jump() {
        System.out.println("Jump jump jump!");
    }

}
