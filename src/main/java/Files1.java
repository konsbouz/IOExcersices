import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files1 {

    public static void LetsDoFiles(){

        try{

            File file1 = new File(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath()+ "task9.1.txt");
            FileWriter fileWriter = new FileWriter(file1);
            File file2 = new File(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task9.2.txt");
            FileWriter fileWriter1 = new FileWriter(file2);

            List<String> list = new ArrayList<>();
            list.add("kostas1 ");
            list.add("kostas2 ");
            list.add("kostas3 ");
            list.add("kostas4 ");
            list.add("kostas5 ");
            list.add("kostas6 ");



            for(String element:list) {
                fileWriter.write(element);

                fileWriter1.write(element);





                System.out.println("task 9 done");
            }
            fileWriter.close();
            fileWriter1.close();

        }


        catch (IOException e){
            e.printStackTrace();


        }


    }


}
