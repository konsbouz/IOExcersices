import java.io.*;

public class CharArrayWriter1 {


    public static void WriteCharArraysToFiles(){


        try(FileWriter f1 = new FileWriter(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task4.1.txt");
            FileWriter f2 = new FileWriter(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task4.2.txt");
            CharArrayWriter caw = new CharArrayWriter()){

            String str = "Kostas1 \nKostas2 \nKostas3";
            char[] charArray = str.toCharArray();
            caw.write(charArray);
            caw.writeTo(f1);
            caw.writeTo(f2);

            System.out.println("task 5 done");



        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
