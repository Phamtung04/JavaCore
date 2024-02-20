package assignment.Exercise06;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VietnamesePhone VN = new VietnamesePhone();

        while (true) {
            System.out.println("0. SHOW");
            System.out.println("1. insertContact");
            System.out.println("2. RemoveContact");
            System.out.println("3. UpdateContact");
            System.out.println("4. SearchContact");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng...");

            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 0) {
                VN.show();
            }else if (menu == 1) {
                System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG INSERT");
                System.out.println("Mời nhập name: ");
                String name = sc.nextLine();
                System.out.println("Mời nhập Phone: ");
                String phone = sc.nextLine();
                VN.insertContact(name, phone);
            } else if (menu == 2) {
                System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG REMOVE");
                System.out.println("Mời nhập name: ");
                String name = sc.nextLine();
                VN.removeContact(name);
            } else if (menu == 3) {
                System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG UPDATE");
                System.out.println("Mời nhập name: ");
                String name = sc.nextLine();
                System.out.println("Mời nhập newPhone: ");
                String newPhone = sc.nextLine();
                VN.updateContact(name, newPhone);
            } else if (menu == 4) {
                System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG SEARCH");
                System.out.println("Mời nhập name: ");
                String name = sc.nextLine();
                VN.searchContact(name);
            }else {
                return;
            }
        }
    }
}
