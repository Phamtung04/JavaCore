package assignment.Exercise05.Question4;

public class TaiLieu {
    private int id;
    private String tenNhaXuatBan;
    private String soBanPhatHanh;
    public TaiLieu() {}

    public TaiLieu(int id, String tenNhaXuatBan, String soBanPhatHanh) {
        this.id = id;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id=" + id +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soBanPhatHanh='" + soBanPhatHanh + '\'' +
                '}';
    }
}
