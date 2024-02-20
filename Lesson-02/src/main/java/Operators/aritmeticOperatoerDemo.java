package Operators;

public class aritmeticOperatoerDemo {
    public static void main(String[] args) {
        // +, -, *, /, %
        int a = 19;
        int b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // +=, -=, *=, /=, %=
        a += 10;
        System.out.println("a = " + a);
        // ++, --
        int c = a++;
        System.out.println("a = " + a);
        //int c = a;
        // a = a + 1

        int d = ++a;
        // a = a + 1
        // int d = a


    }
}
