import gr.codelearn.io.Directory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Files1 {


    public static void LetsDoFiles(){

        try{

            File file1 = new File(Directory.FILE_DIRECTORY.getPath()+ "task9.1.txt");
            FileWriter fileWriter = new FileWriter(file1);
            File file2 = new File(Directory.FILE_DIRECTORY.getPath() + "task9.2.txt");
            FileWriter fileWriter1 = new FileWriter(file2);

            fileWriter.write("kostas");
            fileWriter.close();
            fileWriter1.write("Kostas1 \nKostas2 \nKostas3");
            fileWriter1.close();


            System.out.println("task 9 done");


        }


        catch (IOException e){
            e.printStackTrace();


        }


    }

}
