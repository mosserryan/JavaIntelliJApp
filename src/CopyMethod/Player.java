package CopyMethod;

public class Player {

    String name;
    int level;
    int healthPoints;

    Player(String name, int level, int healthPoints) {

        setName(name);
        setLevel(level);
        setHealthPoints(healthPoints);

    }

    Player(Player targetPlayer) {
        copyPlayer(targetPlayer);
    }

    String getName() {
        return this.name;
    }
    int getLevel() {
        return this.level;
    }
    int getHealthPoints() {
        return this.healthPoints;
    }

    String setName(String name) {
        return this.name = name;
    }
    int setLevel(int level) {
        return this.level = level;
    }
    int setHealthPoints(int healthPoints) {
        return this.healthPoints = healthPoints;
    }

    String playerStats () {
        return "Name: " + getName() + "\n" + "Level: " + getLevel() + "\n" + "Health Points: " + getHealthPoints();
    }

    public void copyPlayer(Player targetPlayer) {
         this.setName(targetPlayer.getName());
         this.setLevel(targetPlayer.getLevel());
         this.setHealthPoints(targetPlayer.getHealthPoints());
    }

}
