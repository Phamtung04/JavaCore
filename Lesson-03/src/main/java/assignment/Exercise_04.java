package assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise_04 {
    public void question01() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] a = input.split(" ");
        int count = 0;
        for (String s : a) {
            if (!s.isEmpty()){
                count ++;
            }
        }

        System.out.println("count = " + count);
    }

    // Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public void question02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhập xâu S1: ");
        String S1 = sc.nextLine();
        System.out.println("\nNhập xâu s2: ");
        String S2 = sc.nextLine();
        System.out.println("\n Nối chuỗi S1 và S2 là: " + S1.concat(S2));
    }


    //Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.
    public void question03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Mời nhập tên: ");
        String name = sc.nextLine();

        String capName = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println("capName = " + capName);

    }

    // question 4:  Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
    public void question04() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Mời nhập tên: ");
        String name = sc.nextLine();

        name = name.toUpperCase();
        for (int i = 0; i < name.length() ; i++) {
            System.out.println("Ký tự thứ " +  (i + 1) + " là: " + name.charAt(i));
        }
    }

    //question 5:  Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.
    public void question05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhập họ: ");
        String firstName = sc.nextLine();
        System.out.println("\nNhập tên: ");
        String lastName = sc.nextLine();

        System.out.println("\nFullnam là: " + firstName.concat(lastName));
    }

    // question 7:
    public void question07() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String a = s.trim().replaceAll("\\s{2,}", " ");
        System.out.println("a = " + a);

        String b = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                b += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
            }
        }
        System.out.println(b);
    }

    public void question10() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2) System.out.println("KO");
        else {
            boolean isOk = true;
            for (int i = 0; i < len1 ; i++) {
                char char1 = s1.charAt(i);
                char char2 = s2.charAt(len2 -1 -i);
                if(char1 != char2){
                    isOk = false;
                    break;
                }
            }
            System.out.println(isOk ? "OK" : "KO");
        }
        // c2:
        String s = new StringBuilder(s2).reverse().toString();
        System.out.println(s1.equals(s) ? "OK" : "KO");

    }

    // question 11: Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public void question11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Mời nhập chuỗi: ");
        String s1 = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                count += 1;
            }
        }
        System.out.println("count = " + count);
    }

    public void question12() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int length = a.length();
        String s = "";
        for (int i = length - 1; i >= 0 ; i--) {
            s += a.charAt(i);
        }
        System.out.println("s = " + s);

        //c2:
        String s2 = new StringBuilder(a).reverse().toString();
        System.out.println("s2 = " + s2);
    }

    // question 13: Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
    public void question13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nmời nhập chuỗi: ");
        String s1 = sc.nextLine();
        boolean a = true;
        for (char ch : s1.toCharArray()) {
            if (Character.isDigit(ch)) {
                a = false;
                break;
            }
        }
        System.out.println(a);
    }

    // question 14:  Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
    public void question14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập chuỗi: ");
        String s1 = sc.nextLine();
        System.out.println("\nChuoi vừa nhập là: " + s1);
        System.out.println("\nNhập Char cần thay: ");
        String c1 = sc.nextLine();
        System.out.println("Nhập ký tự thay: ");
        String c2 = sc.nextLine();
        System.out.println("\nChuỗi được thay đổi ký tự là: " + s1.replaceAll( c1, c2));
    }

    // question 15: Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
    public void question15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: \n");
        String s1 = sc.nextLine().trim();
        String[] a = s1.split(" ");
        for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }

}
