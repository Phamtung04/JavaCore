package Exception;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 1;
            int c = a/b;
            System.out.println("c = " + c);

            String s = null;
            s.trim();
        } catch (ArithmeticException exception) {
            System.out.printf("Không chia cho 0");
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("có lỗi hay không thì vẫn được gọi");
        }

    }
}
