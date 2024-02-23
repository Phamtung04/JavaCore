package file;

import Assignment.Exercise03.FileManager;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        boolean exists = FileManager.exists(path);
        System.out.println("exists = " + exists);

        boolean createNewFile = FileManager.createNewFile(path);
        System.out.println("createNewFile = " + createNewFile);

        boolean delete = FileManager.delete(path);
        System.out.println("delete = " + delete);

        String[] names = FileManager.list(".");
        for (String name : names) {
            System.out.println(name);
        }

        String from = "123.txt";
        String to = "456.txt";
        boolean renameTo = FileManager.renameTo(from, to);
        System.out.println("renameTo = " + renameTo);
    }
}
