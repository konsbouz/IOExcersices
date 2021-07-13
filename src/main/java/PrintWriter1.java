import gr.codelearn.io.Directory;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {


    public static void WriteNamesToFile() {


        File F = new File(Directory.FILE_DIRECTORY.getPath() + "task6.txt");

        try (PrintWriter pw = new PrintWriter(F)){

            pw.println("Kostas1");
            pw.println("Jostas2");
            pw.println("Kostas3");

            System.out.println("task 6 done");
        }


    catch(IOException e){
        e.printStackTrace();
        }

    }
}
