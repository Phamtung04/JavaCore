package FlowControl;

public class WhileDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i++]);
        }
    }
}
