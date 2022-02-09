package ChairForceRPG;

import javax.swing.*;

public class Main {

    public static void main (String[] args) {
        String characterName01 = JOptionPane.showInputDialog("Enter your character's name.");

        Player ryeGuy = new Player(characterName01);

        System.out.println(ryeGuy);
        ryeGuy.createCharacter();

        String characterName02 = JOptionPane.showInputDialog("Enter your character's name.");
        Player specialK = new Player(characterName02);
        specialK.createCharacter();

    }



}
