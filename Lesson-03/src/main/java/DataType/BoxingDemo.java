package DataType;

public class BoxingDemo {
    public static void main(String[] args) {
        int a = 5;

        // boxing
        Integer b = Integer.valueOf(a);
        System.out.println("b = " + b);

        int c = Integer.parseInt("1234");
        System.out.println("c = " + c);
    }
}
