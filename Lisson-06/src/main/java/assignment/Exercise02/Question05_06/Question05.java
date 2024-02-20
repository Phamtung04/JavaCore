package assignment.Exercise02.Question05_06;

import java.util.Scanner;

public class Question05 {
    Scanner sc = new Scanner(System.in);
    public int inputAge() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception exception) {
                System.err.println("wrong inputing! Please input an age as int, input again.");
                System.err.println("Nhập lại...");
            }
        }
    }

    public int checkNumber() {
        while (true) {
            int number = inputAge();
            try {
                if (number >= 0) {
                    return number;
                } else {
                    System.err.println("Wrong inputing! The age must be greater than 0, please input again.");
                    System.err.println("Nhập lại...");
                }
            } catch (Exception exception) {
                    System.err.println(exception.getMessage());
            }
        }
    }
}
