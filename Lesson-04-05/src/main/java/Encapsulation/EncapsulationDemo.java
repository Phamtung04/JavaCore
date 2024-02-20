package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Encapsulation: tính đóng gói
        // 1. property: private
        // 2. Cung cấp getter/ setter
        Animal animal = new Animal(1, "abc");
        System.out.println("animal.getId() = " + animal.getId());
        System.out.println("animal.getId() = " + animal.getName());
    }
}
