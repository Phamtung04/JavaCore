package DatatypeCasting;

public class wideningDemo {
    public static void main(String[] args) {
        // byte --> short --> int --> long --> float --> double

        int a = 2;
        long b = (long) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // implicit (Khuyến khích)
        long c = a;
    }
}
