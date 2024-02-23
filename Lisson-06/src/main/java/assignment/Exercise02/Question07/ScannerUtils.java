package assignment.Exercise02.Question07;

import java.util.Scanner;

public class ScannerUtils {
    private Scanner sc = new Scanner(System.in);

    public int inputAge() {
        while (true) {
            try {
                String input = sc.nextLine();
                int age = Integer.parseInt(input);
                if (age < 0) {
                    System.err.println("Nhập vào số dương");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.err.println("yêu cầu nhập vào số nguyên");
            }
        }
    }

    public int inputInt() {
        while (true) {
            try {
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Nhập vào số nguyên");
            }
        }
    }

    public String inputString() {
        return sc.nextLine().trim().replaceAll("\\s+", " ");
    }
}
