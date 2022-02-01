package FileClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main (String[] args) {

        File file = new File("TextDoc.txt");

        if(file.exists()) {
            System.out.println("The file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

        } else {
            System.out.println("That file doesn't exist");
        }

        try {
            FileWriter writer = new FileWriter("TextDoc.txt");
            writer.write("Melvins be trippin.");
            writer.close(); // Must close to make changes.
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
