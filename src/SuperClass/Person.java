package SuperClass;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        if(this.age < 21) {
            System.out.println("This might be Spiderman.");
        }
    }

    public String toString() {
     return this.name + "\n" + this.age + "\n";
    }

}
