package abstranction;

public class Circle extends Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
