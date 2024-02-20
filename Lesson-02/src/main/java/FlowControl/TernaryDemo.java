package FlowControl;

public class TernaryDemo {
    public static void main(String[] args) {
        int age = 20;
        String message = (age >= 18) ? "Bạn đã đủ 18 tủi." : "Bạn chưa đủ 18 tuổi";
        System.out.println("message = " + message);

        int a = 200;
        int b = 10;
        System.out.println(a > b ? a : b);
    }
}
