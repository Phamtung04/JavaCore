package assignment.Exercise05.Question4;

import java.time.LocalDate;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private LocalDate thangPhatHanh;

    public TapChi() {}

    public TapChi(int soPhatHanh, LocalDate thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(int id, String tenNhaXuatBan, String soBanPhatHanh, int soPhatHanh, LocalDate thangPhatHanh) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public LocalDate getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(LocalDate thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
