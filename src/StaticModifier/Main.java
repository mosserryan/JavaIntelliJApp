package StaticModifier;

public class Main {

    public static void main(String[] args) {

        Friends friend1 = new Friends("Daniel");
        Friends friend2 = new Friends("Alie");
        Friends friend3 = new Friends("Mill-Dawg");

        //Ability to access the numOfFriends using just the Friends class due to it being a static int.
        System.out.println(Friends.numOfFriends);

    }

}
