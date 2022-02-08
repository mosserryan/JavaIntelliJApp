package RPG;

public class Entity {

    int healthPoints;
    int stamina;
    int mana;
    int strengthLevel;
    int intelligenceLevel;
    int dexterityLevel;

    public Entity(int healthPoints, int stamina, int mana, int strength, int intelligence, int dexterity) {

        this.healthPoints = healthPoints;
        this.stamina = stamina;
        this.mana = mana;
        this.strengthLevel = strength;
        this.intelligenceLevel = intelligence;
        this.dexterityLevel = dexterity;

    }
}
