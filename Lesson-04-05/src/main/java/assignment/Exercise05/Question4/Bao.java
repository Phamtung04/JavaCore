package assignment.Exercise05.Question4;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    private LocalDate ngayPhatHanh;

    public Bao() {}

    public Bao(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int id, String tenNhaXuatBan, String soBanPhatHanh, LocalDate ngayPhatHanh) {
        super(id, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
