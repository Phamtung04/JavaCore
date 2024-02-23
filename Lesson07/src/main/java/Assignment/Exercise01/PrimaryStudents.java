package Assignment.Exercise01;

public class PrimaryStudents extends Student{
    public static int countPrimaryStudent;

    public PrimaryStudents(String name) {
        super(name);
        ++countPrimaryStudent;
    }


}
