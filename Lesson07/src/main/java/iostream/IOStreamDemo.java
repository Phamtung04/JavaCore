package iostream;

import java.io.*;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "abc.txt";
        String content = "Java core";
        write(path, content, true);
        write(path, content, true);
        write(path, content, true);
        String read = read(path);
        System.out.println("read = " + read);
    }

    public static String read(String path) {
        try(
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
            return ois.readUTF();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void write(String path, String content, boolean append) {
        try(
                FileOutputStream fos = new FileOutputStream(path, append);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
            ) {
            oos.writeUTF(content);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
