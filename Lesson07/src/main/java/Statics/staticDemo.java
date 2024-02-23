package Statics;

public class staticDemo {
    public static void main(String[] args) {
        // static không thể gọi non-static, nhưng non-static có thể gọi static.
        System.out.println("myMath.pi = " + myMath.pi);
        int max = myMath.max(10, 100);
        System.out.println("max = " + max);
    }
}
