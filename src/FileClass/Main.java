package FileClass;

import java.io.File;

public class Main {

    public static void main (String[] args) {

        File file = new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\SkyrimVR");

        if(file.exists()) {
            System.out.println("The file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

        } else {
            System.out.println("That file doesn't exist");
        }

    }

}
