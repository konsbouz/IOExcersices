import gr.codelearn.io.Directory;

import java.io.*;

public class TransferTo {

    public static void CopyBytesTo() {


        try (InputStream fis = new FileInputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task9.1.txt");
             OutputStream fos = new FileOutputStream(Directory.FILE_DIRECTORY.getPath() + "task2.1.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            fis.transferTo(bos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



