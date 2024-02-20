package assignment.Exercise02.Question01_02;

public class Program {
    public static void main(String[] args) {
        try {
            float result = divide(5, 0);
            System.out.println("result = " + result);
        } catch (ArithmeticException exception) {
            System.out.println("cannot divide 0");
        } finally {
            System.out.println("divide completed!");
        }
    }

    public static float divide(int a, int b) {
        return a / b;
    }
}
