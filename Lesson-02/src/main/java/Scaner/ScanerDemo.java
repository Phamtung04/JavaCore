package Scaner;

import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMời bạn nhập vào thông tin: ");
        System.out.println("Nhập vào tuổi:");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.err.println("Nhập lại!");
        }
        int age = scanner.nextInt();
        System.out.println("age = " + age);

        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("name = " + name);
    }
}
