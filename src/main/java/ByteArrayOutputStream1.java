import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ByteArrayOutputStream1 {



    public static void writeArraysToFiles() {
        try (FileOutputStream fos1 = new FileOutputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task2.1.txt");
             FileOutputStream fos2 = new FileOutputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task2.2.txt");
             java.io.ByteArrayOutputStream baos =new java.io.ByteArrayOutputStream();
             )
        {

            List<String> list = new ArrayList<>();
            list.add("kostas1 ");
            list.add("kostas2 ");

            for( String element : list){

                baos.write(element.getBytes());
                baos.writeTo(fos1);
                baos.writeTo(fos2);
                baos.reset();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
