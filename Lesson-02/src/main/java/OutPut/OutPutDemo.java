package OutPut;

import java.util.Locale;

public class OutPutDemo {
    public static void main(String[] args) {
        // Escaped characters
        // \\: \
        // \": "
        // \': '
        // \t: tab
        // \n: xuống dòng

        // println:
        System.out.println("Hello,");
        System.out.println("java!");

        //print
        System.out.print("Hello,");
        System.out.print("java!");

        //Printf:
        // %s: String
        // %d: số nguyên
        // %f: số thực
        // %c: kiểu char
        // %n: xuống dòng
        // %8s: đại diện cho String có độ dài = 8, căn lề phải
        // %-8s: đại diện cho String có độ dài = 8, căn lề trái
        // %S, %C: đại diện cho string ở dạng in hoa
        // %.2f: đại diện cho số thực làm tròn 2 chữ số
        // %,d: đại diện cho số nguyên nhóm theo 3 chữ số
        String name = "Khoa";
        int age = 30;
        System.out.println("\n+----------+----------+");
        System.out.println("|   NAME   |   AGE    |");
        System.out.println("+----------+----------+");
        System.out.printf("| %-8s | %8d |%n", name, age);
        System.out.println("+----------+----------+");
        int money = 234543222;
        System.out.printf(new Locale("vi", "VN"),"%ntiền: %,d", money);

    }
}
