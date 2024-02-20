package FlowControl;

public class forIndexDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i) ;
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++){
            System.out.println("number " + i + " = " + numbers[i]);
        }
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println("number " + i + " = " + numbers[i]);
        }

    }
}
