package Encapsulation;

import java.util.Random;

public class Main {

    // Encapsulation: Attributes of a class will be hidden or private,
    //                and can only be accessed through methods (getters & setters)
    //                You should make attributes private if you don't have a reason to make them public or protected.

    public static void main (String[] args) {
        Person personOne = new Person("Ryan", 28, 100);

        takeDamage(personOne);
    }


    public static void takeDamage(Person person) {

        Random random = new Random();
        int damageTaken = random.nextInt(10);
        int currentHealth = person.getHealth();
        String name = person.getName();

        currentHealth = currentHealth - damageTaken;

         System.out.println(name + " took " + damageTaken + " damage.");

        if (currentHealth <= 0) {
            System.out.println(name + " took a fatal blow and is now dead.");
            currentHealth = 0;
        }

        person.setHealth(currentHealth);
        System.out.println(person.getHealth());

    }

}
