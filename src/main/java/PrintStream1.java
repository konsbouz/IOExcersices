import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class PrintStream1 {

    public static void LetsWriteToFile() {

        File F = new File(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task3.txt");

        try (PrintStream fileWriter = new PrintStream(F);) {

            List<String> list = new ArrayList<>();
            list.add("kostas1 ");
            list.add("kostas2 ");

            for (String element : list) {
                fileWriter.println(element);

            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }


    }
}
