package assignment.Exercise02.Question07;

import java.util.Scanner;

public class ScannerUtils {
    public int inputInt(String errorMessage) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception exception) {
                System.err.println(errorMessage);
            }
        }
    }
}
