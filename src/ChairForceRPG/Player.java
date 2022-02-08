package ChairForceRPG;

import RPG.HumanWarrior;

import javax.swing.*;

public class Player {

    private String name;
    private int healthPoints = 100;
    private int stamina = 100;
    private int mana = 100;
    private int level = 1;
    private String playerClass;
    private String race;

    Player(String name) {

        this.name = name;
//        int healthPoints = this.healthPoints;
//        int energy = this.energy;
//        int level = this.level;
//        String playerClass;
//        String race;

    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Health: " + this.healthPoints + "\n" + "Stamina: " + this.stamina + "\n" + "Mana: " + this.mana + "\n" + "Level: " + this.level + "\n" + "Race: " + this.race + "\n" + "class: " + this.playerClass;
    }

    public void createCharacter() {

        chooseRace();
        System.out.println(this);
        chooseClass();
        System.out.println(this);

    }

    public void chooseRace() {

        String characterRace = JOptionPane.showInputDialog("Enter your character's race. [Human or Orc]");

        while (!characterRace.equalsIgnoreCase("human") && !characterRace.equalsIgnoreCase("orc")) {

            characterRace = JOptionPane.showInputDialog("You chose " + characterRace
                    + ". You did not choose one of the two options! Enter your character's class. [Human or Orc]").toLowerCase();

        }

        characterRace = characterRace.substring(0, 1).toUpperCase() + characterRace.substring(1); // Capitalize first letter of string, just in case user doesn't.


        if (characterRace.equalsIgnoreCase("human")) {

            this.healthPoints = this.healthPoints + 10;
            this.stamina = this.stamina + 10;
            this.mana = this.mana + 10;
            this.race = characterRace;

        } else if (characterRace.equalsIgnoreCase("orc")) {

            this.healthPoints = this.healthPoints + 10;
            this.stamina = this.stamina + 15;
            this.mana = this.mana + 5;
            this.race = characterRace;

        }

    }

    public void chooseClass() {

        String characterClass = JOptionPane.showInputDialog("Enter your character's class. [Warrior, Hunter, or Wizard]");

        while (!characterClass.equalsIgnoreCase("warrior")
                && !characterClass.equalsIgnoreCase("hunter")
                && !characterClass.equalsIgnoreCase("wizard")) {

            characterClass = JOptionPane.showInputDialog("You chose " + characterClass
                    + ". You did not choose one of the three options! Enter your character's class. "
                    + "[Warrior, Hunter, or Wizard]");

        }

        characterClass = characterClass.substring(0, 1).toUpperCase() + characterClass.substring(1); // Capitalize first letter of string, just in case user doesn't.

        if(characterClass.equalsIgnoreCase("warrior")) {
            this.healthPoints = this.healthPoints + 30;
            this.stamina = this.stamina + 15;
            this.mana = this.mana + 5;
            this.playerClass = characterClass;
        } else if (characterClass.equalsIgnoreCase("hunter")) {
            this.healthPoints = this.healthPoints + 20;
            this.stamina = this.stamina + 20;
            this.mana = this.mana + 10;
            this.playerClass = characterClass;
        } else if (characterClass.equalsIgnoreCase("wizard")) {
            this.healthPoints = this.healthPoints + 10;
            this.stamina = this.stamina + 10;
            this.mana = this.mana + 30;
            this.playerClass = characterClass;
        }

    }

}
