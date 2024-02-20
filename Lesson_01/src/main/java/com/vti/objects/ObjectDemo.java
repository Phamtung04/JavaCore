package com.vti.objects;

public class ObjectDemo {
    public static void main(String[] args) {
        // Class: Bản thiết kế
        // VD: Class Dog

        // object: ĐỐi tượng được tạo từ class
        Dog dog = new Dog();
        dog.name = "Shiba";
        dog.age = 5;
        dog.color = "Red";
        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.name = " + dog.age);
        System.out.println("dog.name = " + dog.color);
    }
}
