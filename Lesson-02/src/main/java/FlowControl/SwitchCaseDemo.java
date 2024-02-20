package FlowControl;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int month = 6;

        switch (month) {
            case 2:
                System.out.println("Tháng này có 28 hoặc 29 ngày:");
                break;
            case 4, 6, 9, 11:
                System.out.println("có 30 ngày.");
                break;
            default:
                System.out.println("có 31 ngày");
                break;
        }
    }
}
