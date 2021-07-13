import gr.codelearn.io.Directory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Files2 {


    public static void LetsReadFiles() {

        try {

            File file1 = new File(Directory.FILE_DIRECTORY.getPath() + "task9.1.txt");

            Scanner myReader = new Scanner(file1);

            while (myReader.hasNextLine()) {

                String Data = myReader.nextLine();
                System.out.println(Data);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
