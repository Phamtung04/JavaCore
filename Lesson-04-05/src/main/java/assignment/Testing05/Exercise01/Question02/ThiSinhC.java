package assignment.Testing05.Exercise01.Question02;

public class ThiSinhC extends ThiSinh{
    public ThiSinhC(String SBD, String ten, String diaChi, String mucUuTien) {
        super(SBD, ten, diaChi, mucUuTien);
    }

    @Override
    public String getMonThi() {
        return "Văn, Sử, Địa";
    }
}
