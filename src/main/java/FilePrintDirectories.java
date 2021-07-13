import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.DirectoryStream;

public class FilePrintDirectories {


    public static void listFolder(File dir) {

        File[] subDirs = dir.listFiles(new FileFilter() {


            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        System.out.println("Directories of " + dir.getAbsolutePath() + " is : " + dir.getName() );


        for (File folder: subDirs){
            listFolder(folder);

        }


    }


}



