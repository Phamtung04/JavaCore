package Statics;

public class Student {
    private int id;
    private String name;

    private static int count = 0;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }
}
