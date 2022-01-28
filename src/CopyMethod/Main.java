package CopyMethod;

public class Main {

    public static void main(String[] args) {

        Player playerOne = new Player("RyeGuy",9, 100);
        System.out.println("[Player One] " + "\n" + playerOne.playerStats());

        // We can create the new player and then copy using the method.
         Player playerTwo = new Player("Melvin", 1, 50);
        System.out.println("\n" + "[Player Two BEFORE copy] " + "\n" + playerTwo.playerStats());
         playerTwo.copyPlayer(playerOne);
        System.out.println("\n" + "[Player Two AFTER copy] " + "\n" + playerTwo.playerStats());

        // Another way is to create the newPlayer and pass in the player to be copied as an argument
        // for our overloaded copy constructor.
        Player playerThree = new Player(playerOne);
        System.out.println("\n" + "[Player Three created as a copy] " + "\n" + playerThree.playerStats());

    }



}
