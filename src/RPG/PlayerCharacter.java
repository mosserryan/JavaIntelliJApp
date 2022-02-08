package RPG;

import javax.swing.*;

public class PlayerCharacter {

    public void createCharacter() {

        int healthPoints = 0;
        int stamina = 0;
        int mana = 0;
        int strength = 0;
        int intelligence = 0;
        int dexterity = 0;

        String characterName = JOptionPane.showInputDialog("Enter your character's name.");

        String characterRace = JOptionPane.showInputDialog("Enter your character's race. [Human or Orc]").toLowerCase();

        while (characterRace.equalsIgnoreCase("human") == false && characterRace.equalsIgnoreCase("orc") == false) {
            characterRace = JOptionPane.showInputDialog("You chose " + characterRace + ". You did not choose one of the two options! Enter your character's class. [Human or Orc]").toLowerCase();
        }

        if(characterRace.equalsIgnoreCase("human")) {

           // Human character = new Human(characterName, healthPoints, stamina, mana, strength, intelligence, dexterity, characterRace);

            String characterClass = JOptionPane.showInputDialog("Enter your character's class. [Warrior, Hunter, or Wizard]");

            while (characterClass.equalsIgnoreCase("warrior") == false && characterClass.equalsIgnoreCase("hunter") == false && characterClass.equalsIgnoreCase("wizard") == false) {
                characterClass = JOptionPane.showInputDialog("You chose " + characterClass + ". You did not choose one of the three options! Enter your character's class. [Warrior, Hunter, or Wizard]").toLowerCase();
            }

            if(characterClass.equalsIgnoreCase("warrior")) {
                HumanWarrior character = new HumanWarrior(characterName, 0,0,0,0,0,0,null);
                System.out.println("\n"+ "You've created the following character: " + "\n" + character);
            } else if (characterClass.equalsIgnoreCase("hunter")) {
                healthPoints = 120;
                stamina = 130;
                mana = 120;
                strength = 10;
                intelligence = 10;
                dexterity = 15;
            } else if (characterClass.equalsIgnoreCase("wizard")) {
                healthPoints = 120;
                stamina = 110;
                mana = 140;
                strength = 10;
                intelligence = 20;
                dexterity = 5;
            }


        } else if (characterRace.equalsIgnoreCase("orc")) {
            String character = "orc";
        }









        //JOptionPane.showMessageDialog(null, character);





    }

}
