package assignment.Exercise02.Question04;

public class program {

    private static String[] deparment = {"sale", "bảo vệ", "giám đốc"};
    public static void getIndex(int index) {
        try {
            System.out.println(deparment[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Cannot find department.");
        }
    }
    public static void main(String[] args) {
        getIndex(4);
    }

}
