import gr.codelearn.io.Directory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {

    public static void LetsDoIt(){


        try(FileReader fr = new FileReader(Directory.FILE_DIRECTORY.getPath()+ "task6.txt");
        FileWriter fw = new FileWriter(Directory.FILE_DIRECTORY.getPath()+ "task7.txt")){

            int i;
            while((i = fr.read()) != -1){

                fw.write(i);


            }
            System.out.println("task 7 done");

        }

        catch(IOException e){

            e.printStackTrace();
        }


    }



    }



