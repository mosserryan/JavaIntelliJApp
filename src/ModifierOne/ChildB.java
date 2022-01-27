package ModifierOne;
import ModifierTwo.*;

public class ChildB extends MainB{

    public static void main(String[] args) {

        // Protected keyword can be used within the same package or outside.
        // As long as it's a child class using a parent classes protected keyword.
       ChildB childB = new ChildB();
        System.out.println(childB.protectedMessage);

        ChildBTwo childBTwo = new ChildBTwo();
        childBTwo.saySomething(childB.protectedMessage);

    }

}
