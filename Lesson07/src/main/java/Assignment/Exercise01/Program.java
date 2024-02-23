package Assignment.Exercise01;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Student st1 = new Student( "Nguyen Văn A");
        Student st2 = new Student( "Nguyen Van B");
        Student st3 = new Student("Nguyen Van C");
        Student[] a = {st1, st2, st3};

        Student.setCollage("đại học Bách Khoa");

        for (Student student : a) {
            System.out.println(student);
        }

        Student.setCollage("Đại học Công nghệ");
        for (Student student : a) {
            System.out.println(student);
        }

        // question 3:
        System.out.println("Max là: " + MyMath.max(5, 9));
        System.out.println("Min là: " + MyMath.min(5, 8));
        System.out.println("MyMath.sum(5, 5) = " + MyMath.sum(5, 5));

        //question 5:
        for (Student student : a) {

            System.out.println(student);
            System.out.println(++Student.COUNT);
        }


        // question6:
        PrimaryStudents primaryStudents1 = new PrimaryStudents("Nguyên A");
        PrimaryStudents primaryStudents2 = new PrimaryStudents("Nguyễn B");
        SecondaryStudents secondaryStudents1 = new SecondaryStudents("Trần A");
        SecondaryStudents secondaryStudents2 = new SecondaryStudents("Trần B");
        SecondaryStudents secondaryStudents3 = new SecondaryStudents("Trần C");
        SecondaryStudents secondaryStudents4 = new SecondaryStudents("Trần D");
        SecondaryStudents secondaryStudents5 = new SecondaryStudents("Trần E");
        System.out.println("SecondaryStudents.countSecondaryStudent = " + SecondaryStudents.countSecondaryStudent);
        System.out.println("PrimaryStudents.countPrimaryStudent = " + PrimaryStudents.countPrimaryStudent);

        // question 7:
        // question 8:


    }
}
