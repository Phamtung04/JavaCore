package abstranction;

public class Bird implements Run, Flyable{
    @Override
    public void run() {
        System.out.println("chay....");
    }

    @Override
    public void fly() {
        System.out.println("Fly...");
    }
}
