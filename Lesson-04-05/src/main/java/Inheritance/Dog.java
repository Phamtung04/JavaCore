package Inheritance;

public class Dog extends Animal{
    public Dog() {}
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }
}
