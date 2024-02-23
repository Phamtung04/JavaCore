package Exception;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new InvalidAgeException("Không đủ tuổi");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
