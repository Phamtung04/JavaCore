package assignment.Testing05.Exercise01.Question02;

public abstract class ThiSinh {
    private String SBD;
    private String ten;
    private String diaChi;
    private String mucUuTien;
    public abstract String getMonThi();

    public ThiSinh(String SBD, String ten, String diaChi, String mucUuTien) {
        this.SBD = SBD;
        this.ten = ten;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }
}
