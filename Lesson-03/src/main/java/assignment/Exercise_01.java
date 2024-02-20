package assignment;

import java.util.Scanner;

public class Exercise_01 {
    public void question01(){
        float L1 = 5240.5f;
        float L2 = 10970.055f;

        System.out.println("Lương chưa làm tròn của L1 là: " + L1 + " Lương chưa làm tròn của L2 là: " + L2);

        int a = (int) L1;
        int b = (int) L2;
        System.out.printf("Lương đã làm tròn L1: %d, L2: %d", a, b);

    }

    // Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
    String a;
    public String question02(){
        int max = 99999;
        int min = 0;

        int random = (int) (Math.random() * max) + min;
        a = String.valueOf(random);
        if (a.length() < 5) {
            a = "0".repeat(5 - a.length()) + a;
        }
        System.out.println("\nNgẫu nhiên có 5 số là: " + a);
        return a;
    }

    // Lấy 2 số cuối của số ở Question 2 và in ra.
    public void question03(){
        System.out.println("2 số cuối của question02: " + a.substring(3));
    }

    public void question04(){
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("\nMời nhập a: ");
        a = sc.nextInt();
        do {
            System.out.println("\nMời nhập b: ");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Nhập số khác 0");
            }
        } while (b == 0);

        sc.close();
        System.out.println("Thương của a và b là: " + (float) a / b);

    }


}
