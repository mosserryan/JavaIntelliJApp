package ModifierTwo;

public class MainB {

    public String publicMessage = "This is a public message."; // Anytime anywhere. Different packages, it doesn't matter.
    protected String protectedMessage = "This is a protected message."; // Same package, Class or outside package and a subclass.
    String defaultMessage = "This is a default message."; // As long as it's in the same package.
    private String privateMessage = "This is a private message."; // Can only being used within the same class. ONLY.

    void message () {
        System.out.println(privateMessage);
    };

}
