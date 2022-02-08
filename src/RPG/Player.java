package RPG;

public class Player extends Entity{

    String name;


    Player (String name, int healthPoints, int stamina, int mana, int strength, int intelligence, int dexterity) {
        super(healthPoints, stamina, mana, strength, intelligence, dexterity);
        this.name = name;
        this.healthPoints = 100;
        this.stamina = 100;
        this.mana = 100;
        this.strengthLevel = 0;
        this.intelligenceLevel = 0;
        this.dexterityLevel = 0;

    }

    static void introduce () {

    }

    static void greeting () {

    }

    static void attack () {

    }

    static void checkInventory () {

    }

}
