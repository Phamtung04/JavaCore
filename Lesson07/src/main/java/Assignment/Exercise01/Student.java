package Assignment.Exercise01;

public class Student {
    private int id;
    private String name;
    private static String collage;
    static double moneyGroups;
    public static int COUNT;

    public Student(String name) {
        if (COUNT >= 7) {
            throw  new IllegalStateException("Tối đa 7 học sinh");
        }
        this.id = ++COUNT;
        this.name = name;
    }



    public static String getCollage() {
        return collage;
    }

    public static void setCollage(String collage) {
        Student.collage = collage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", collage'" + collage + '\'' +
                '}';
    }
}
