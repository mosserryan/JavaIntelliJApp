package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by:");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("result: " + z);
        } catch(ArithmeticException e) {
            System.out.println("You can divide by zero you melvin!");
        } catch (InputMismatchException e) {
            System.out.println("You must enter a whole number.");
        } catch (Exception e) {
            System.out.println("Using Exception will always prompt this error if something not already covered goes wrong.");
        } finally {
            // finally, always runs at end after try catch.
            System.out.print("The end");
            scanner.close();
        }


    }

}
