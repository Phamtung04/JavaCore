package Finals;

public class FinalDemo {
    public static void main(String[] args) {
        // Dùng: class, methor, property, parameter
         // property. parameter: không thay đổi giá trị sau khi khởi tạo
        final double PI = 3.14159;
        int sum = sum(1,2);
        System.out.println("sum = " + sum);
         // methor: Lớp con không thể ghi đè phương thức đó
         // class: lớp khác sẽ không thể kế thừa lớp đó.
    }

    public static int sum(final int a, final int b) {
//        a = 100;
//        b = 100;
        return a + b;
    }
}
