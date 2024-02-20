package abstranction;

public class AbstranctionDemo {
    public static void main(String[] args) {
        // abstraction: Tính trừu tượng
        // trừu tượng không hoàn toàn (<= 100%>
        // abstraction class: Không thể khởi tạo đối tượng
        Circle circle = new Circle(5.5);
        System.out.println("circle.area() = " + circle.area());

        // Trùy tượng hoàn toàn(100%): interface
        // Từ khóa: implements
        // menthod: public abstract
        Dog dog = new Dog();
        dog.run();

        // Đa kế thừa
        Bird bird = new Bird();
        bird.fly();
        bird.run();



    }
}
