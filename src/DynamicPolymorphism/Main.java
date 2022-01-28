package DynamicPolymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal would you like? A dog or a cat?");
        System.out.print("Press 1 for dog or Press 2 for cat: ");

        int userChoice = scanner.nextInt();

        if(userChoice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (userChoice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            animal.speak();
        }



    }

}
