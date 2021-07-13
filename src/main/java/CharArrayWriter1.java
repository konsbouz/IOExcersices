import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CharArrayWriter1 {

    public static void WriteCharArraysToFiles(){


        try(FileWriter f1 = new FileWriter(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task4.1.txt");
            FileWriter f2 = new FileWriter(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task4.2.txt");
            CharArrayWriter caw = new CharArrayWriter()){

            List<String> list = new ArrayList<>();
            list.add("kostas1 ");
            list.add("kostas2 ");
            list.add("kostas3 ");

            for(String element:list){

            caw.write(element.toCharArray());
            caw.writeTo(f1);
            caw.writeTo(f2);
            caw.reset();

            }





        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
