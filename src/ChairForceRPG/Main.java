package ChairForceRPG;

import javax.swing.*;

public class Main {

    public static void main (String[] args) {
        String characterName = JOptionPane.showInputDialog("Enter your character's name.");

        Player myPlayer = new Player(characterName);

        System.out.println(myPlayer);

        myPlayer.createCharacter();
    }



}
