package Inheritance;

public class Animal {

    private String name;
    private int age;

    public Animal(){}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void eat() {
        System.out.println("Animal is eating...");
    }
    public void run() {
        System.out.println("Animal is running ...");
    }
}
