package DatatypeCasting;

public class NarroningDemo {
    public static void main(String[] args) {
        // double --> float --> long --> int --> short --> byte

        long a = 8;
        int b = (int) a;
        System.out.println("b = " + b);

        // mất mát dữ liệu
        long c = 88888888888L;
        int d = (int) c;
        System.out.println("d = " + d);

        // úng dụng
        int u = 1;
        int v = 2;

        System.out.println("u/v = " + (float) u / v);
    }
}
