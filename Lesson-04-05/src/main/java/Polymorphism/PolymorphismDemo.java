package Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphism: Tính đa hình
        Animal dog = new Dog();
        run(dog);
        Animal cat = new Cat();
        run(cat);
    }

    public static void run(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Dog run:");
        }else {
            System.out.println("Cat run:");
        }
        animal.run();
    }
}
