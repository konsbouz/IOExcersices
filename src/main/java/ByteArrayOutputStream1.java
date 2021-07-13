import java.io.*;


public class ByteArrayOutputStream1 {

    public static void writeArraysToFiles() {
        try (FileOutputStream fos1 = new FileOutputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task1.1.txt");
              FileOutputStream fos2 = new FileOutputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task1.2.txt");
             ByteArrayOutputStream baos =new ByteArrayOutputStream())
        {
            String str = "Kostas1 \nKostas2 \nKostas3";
            byte[] byteArray = str.getBytes();

            baos.write(byteArray);
            baos.writeTo(fos1);
            baos.writeTo(fos2);
            System.out.println("Task 3 Done ");





        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
