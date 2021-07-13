import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PrintWriter1 {


        public static void WriteNamesToFile() {


            File F = new File(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task6.txt");

            try (PrintWriter pw = new PrintWriter(F)) {

                List<String> list = new ArrayList<>();
                list.add("kostas1 ");
                list.add("kostas2 ");
                list.add("kostas3 ");

                for (String element : list) {
                    pw.println(element);


                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


