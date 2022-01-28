package Encapsulation;


public class Person {

    private String name;
    private int age;
    private int health;

    Person(String name, int age, int health) {
        setName(name);
        setAge(age);
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        return this.health = health;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String setName(String name) {
        return this.name = name;
    }


}
