import gr.codelearn.io.Directory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream1 {


    public static void LetsWriteToFile (){

        File F = new File(Directory.FILE_DIRECTORY.getPath() + "task3.txt");

       try(PrintStream fileWriter = new PrintStream(F);){

           fileWriter.println("Kostas1");
           fileWriter.println("Kostas2");
           fileWriter.println("Kostas3");
           System.out.println("task 4 Done");
       }
       catch (FileNotFoundException e){

           e.printStackTrace();
       }



    }

}
