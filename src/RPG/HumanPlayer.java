package RPG;

public class HumanPlayer extends Player{

    String race;

    HumanPlayer(String name, int healthPoints, int stamina, int mana, int strength, int intelligence, int dexterity) {
        super(name, healthPoints, stamina, mana, strength, intelligence, dexterity);

        this.name = name;
        this.healthPoints = healthPoints + 10;
        this.stamina = stamina;
        this.mana = mana + 10;
        this.strengthLevel = strength;
        this.intelligenceLevel = intelligenceLevel + 5;
        this.dexterityLevel = dexterity;
        this.race = "Human";

    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Health: " + this.healthPoints + "\n" + "Stamina: " + this.stamina + "\n" + "Mana: " + this.mana + "\n" + "Strength: " + this.strengthLevel + "\n" + "Intelligence: " + this.intelligenceLevel + "\n" + "Dexterity: " + this.dexterityLevel + "\n" + "Race: " + this.race;
    }


}
