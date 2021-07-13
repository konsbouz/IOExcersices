package gr.codelearn.io;

import java.io.File;

public enum Directory {
    FILE_DIRECTORY(System.getProperty("user.home") + File.separator + "iO"+ File.separator + "task1"  + File.separator);

    private String path;

    Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
