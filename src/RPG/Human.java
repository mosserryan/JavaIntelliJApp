package RPG;

public class Human extends Player{

    String race;

    Human(String name, int healthPoints, int stamina, int mana, int strength, int intelligence, int dexterity, String race) {
        super(name, healthPoints, stamina, mana, strength, intelligence, dexterity);

        this.name = this.name;
        this.healthPoints = this.healthPoints;
        this.stamina = this.stamina;
        this.mana = 10;
        this.strengthLevel = 0;
        this.intelligenceLevel = 5;
        this.dexterityLevel = 0;
        this.race = "Human";

    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Health: " + this.healthPoints + "\n" + "Stamina: " + this.stamina + "\n" + "Mana: " + this.mana + "\n" + "Strength: " + this.strengthLevel + "\n" + "Intelligence: " + this.intelligenceLevel + "\n" + "Dexterity: " + this.dexterityLevel + "\n" + "Race: " + this.race;
    }


}
