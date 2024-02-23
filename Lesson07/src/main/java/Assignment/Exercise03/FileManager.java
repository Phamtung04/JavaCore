package Assignment.Exercise03;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static final String FILE_EXISTS = "Error! File exist.";
    public static final String FILE_NOT_EXIST = "Error! File not exist.";
    public static final String PATH_NOT_FOLDER = "Error! Path not folder.";
    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static boolean createNewFile(String path) throws IOException {
        if (exists(path)) {
            throw new IllegalAccessError(FILE_EXISTS);
        }
        File file = new File(path);
        return file.createNewFile();
    }

    public static boolean delete(String path) {
        if (!exists(path)) {
            throw new IllegalStateException(FILE_NOT_EXIST);
        }
        File file = new File(path);
        return file.delete();
    }

    public static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile();
    }  public static boolean isDirectory(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    public static String[] list(String path) {
        if (!isDirectory(path)) {
            throw new IllegalStateException(PATH_NOT_FOLDER);
        }
        File file = new File(path);
        return file.list();
    }

    public static boolean renameTo(String from, String to) {
        File source = new File(from);
        File destination = new File(to);
        return source.renameTo(destination);
    }


}
