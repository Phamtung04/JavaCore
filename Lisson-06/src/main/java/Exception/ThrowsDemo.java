package Exception;

import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        throw new IOException("file không tồn tại");
    }
}
