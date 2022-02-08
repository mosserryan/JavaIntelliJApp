package RPG;

public class HumanWarrior extends Human{

    HumanWarrior (String name, int healthPoints, int stamina, int mana, int strength, int intelligence, int dexterity, String race) {
        super(name, healthPoints, stamina, mana, strength, intelligence, dexterity, race);

        this.name = this.name;
        this.healthPoints = this.healthPoints + 40;
        this.stamina = this.stamina + 10;
        this.mana = this.mana;
        this.strengthLevel = this.strengthLevel + 20;
        this.intelligenceLevel = this.intelligenceLevel;
        this.dexterityLevel = this.dexterityLevel + 5;
        this.race = "Human";

    }

}
