package RPG;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //System.out.println(createCharacter());
        PlayerCharacter playerCharacter = new PlayerCharacter();
        playerCharacter.createCharacter();

    }

//   public static Human createCharacter () {
//
//        int healthPoints = 0;
//        int stamina = 0;
//        int mana = 0;
//        int strength = 0;
//        int intelligence = 0;
//        int dexterity = 0;
//
//       String characterName = JOptionPane.showInputDialog("Enter your character's name.");
//
//       String characterClass = JOptionPane.showInputDialog("Enter your character's class. [Warrior, Hunter, or Wizard]");
//
//       while (characterClass.equalsIgnoreCase("warrior") == false && characterClass.equalsIgnoreCase("hunter") == false && characterClass.equalsIgnoreCase("wizard") == false) {
//           characterClass = JOptionPane.showInputDialog("You chose " + characterClass + ". You did not choose one of the three options! Enter your character's class. [Warrior, Hunter, or Wizard]").toLowerCase();
//       }
//
//       if(characterClass.equalsIgnoreCase("warrior")) {
//            healthPoints = 140;
//            stamina = 110;
//            mana = 100;
//            strength = 20;
//            intelligence = 0;
//            dexterity = 10;
//       } else if (characterClass.equalsIgnoreCase("hunter")) {
//            healthPoints = 120;
//            stamina = 130;
//            mana = 120;
//            strength = 10;
//            intelligence = 10;
//            dexterity = 15;
//       } else if (characterClass.equalsIgnoreCase("wizard")) {
//            healthPoints = 120;
//            stamina = 110;
//            mana = 140;
//            strength = 10;
//            intelligence = 20;
//            dexterity = 5;
//       }
//
//       String characterRace = JOptionPane.showInputDialog("Enter your character's race. [Human or Orc]").toLowerCase();
//
//       while (characterRace.equalsIgnoreCase("human") == false && characterRace.equalsIgnoreCase("orc") == false) {
//           characterRace = JOptionPane.showInputDialog("You chose " + characterRace + ". You did not choose one of the two options! Enter your character's class. [Human or Orc]").toLowerCase();
//       }
//
//           HumanPlayer character = new HumanPlayer(characterName, healthPoints, stamina, mana, strength, intelligence, dexterity);
//
//           JOptionPane.showMessageDialog(null, character);
//
//           System.out.println("\n"+ "You've created the following character: ");
//
//       return character;
//
//    }

}
