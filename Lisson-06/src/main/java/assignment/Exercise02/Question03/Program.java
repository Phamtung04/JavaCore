package assignment.Exercise02.Question03;

public class Program {
    public static void main(String[] args) {
        try {
            int[] number = {1, 2, 3};
            System.out.println("number[1] = " + number[10]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
