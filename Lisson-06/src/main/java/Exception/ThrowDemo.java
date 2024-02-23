package Exception;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new IllegalStateException("Không đủ tuổi");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
