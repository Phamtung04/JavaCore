package assignment.Testing05.Exercise01.Question02;

public class ThiSinhB extends ThiSinh{

    public ThiSinhB(String SBD, String ten, String diaChi, String mucUuTien) {
        super(SBD, ten, diaChi, mucUuTien);
    }

    @Override
    public String getMonThi() {
        return "Toán, Hóa, Sinh";
    }
}
