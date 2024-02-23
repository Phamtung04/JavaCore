package Assignment.Exercise01;

public abstract class HinhHoc {
    private double a;
    private double b;
    public static int count;


    public abstract double chuVi(double a, double b);
    public abstract double dienTich(double a, double b);

    public HinhHoc(double a, double b) throws Exception {
        super();
        count++;
        if (count < Configs.SO_LUONG_HINH_TOI_DA) {
            this.a = a;
            this.b = b;
        } else {
            throw new HinhHocException("Số lượng hình tối đa là " + Configs.SO_LUONG_HINH_TOI_DA);
        }
    }
}
