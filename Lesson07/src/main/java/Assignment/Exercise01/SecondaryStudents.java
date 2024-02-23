package Assignment.Exercise01;

public class SecondaryStudents extends Student {
    public static int countSecondaryStudent;

    public SecondaryStudents(String name) {
        super(name);
        countSecondaryStudent++;
    }
}
