package assignment.Exercise05.Question4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    public static int id = 0;
    private List<TaiLieu> taiLieuList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void show() {
        while (true) {
            System.out.println("1. Thêm tài liệu:");
            System.out.println("2. Xóa tài liệu theo mã: ");
            System.out.println("3. hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát chương trình");
            System.out.println("CHỌN CHỨC NĂNG: ");

            int menu = sc.nextInt();
            if (menu == 1) {
                themTaiLieu();
            } else if (menu == 2) {
                xoaTaiLieu();
            }else if (menu == 3){
                hienThi();
            } else if (menu == 4) {
                timKiem();
            }else if (menu == 5){
                return;
            } else {
                System.out.println("Nhập lại");
            }
        }
    }

    // Them tai lieu
    public void themTaiLieu() {
        int menuNumber;
        do {
            System.out.println("1. Thêm sách");
            System.out.println("2. Tạp chí");
            System.out.println("3. Báo");
            System.out.println("Chọn menu");

            menuNumber = sc.nextInt();
        } while (menuNumber < 1 || menuNumber > 3 );
        if (menuNumber == 1){
            System.out.println("Nhập tên nhà xuất bản: ");
            sc.nextLine();
            String nhaXuatBan = sc.nextLine();
            System.out.println("Nhập số bản phát hành: ");
            String SBPH = sc.nextLine();
            System.out.println("Nhập tên tác giả: ");
            String tenTacGia = sc.nextLine();
            System.out.println("Nhập số trang: ");
            int ST = sc.nextInt();
            id++;
            Sach s = new Sach(id, nhaXuatBan, SBPH, tenTacGia, ST);
            taiLieuList.add(s);
        } else if (menuNumber == 2) {
            System.out.println("Nhập tên nhà xuất bản: ");
            sc.nextLine();
            String nhaXuatBan = sc.nextLine();
            System.out.println("Nhập số bản phát hành: ");
            String SBPH = sc.nextLine();
            System.out.println("Nhập số phát hành: ");
            int SPH = sc.nextInt();
            System.out.println("Nhập ngày phát hành: ");
            int ngay = sc.nextInt();
            System.out.println("Nhập thang phát hành: ");
            int thang = sc.nextInt();
            System.out.println("Nhập nam phát hành: ");
            int nam = sc.nextInt();
            LocalDate date = LocalDate.of(nam, thang, ngay);
            id++;
            TapChi tc = new TapChi(id, nhaXuatBan, SBPH, SPH, date);
            taiLieuList.add(tc);
        } else if (menuNumber == 3) {
            System.out.println("Nhập tên nhà xuất bản: ");
            sc.nextLine();
            String nhaXuatBan = sc.nextLine();
            System.out.println("Nhập số bản phát hành: ");
            String SBPH = sc.nextLine();
            System.out.println("Nhập ngày phát hành: ");
            int ngay = sc.nextInt();
            System.out.println("Nhập thang phát hành: ");
            int thang = sc.nextInt();
            System.out.println("Nhập nam phát hành: ");
            int nam = sc.nextInt();
            LocalDate date = LocalDate.of(nam, thang, ngay);
            id++;
            Bao B = new Bao(id, nhaXuatBan, SBPH, date);
            taiLieuList.add(B);
        }
    }

    // xóa tài liệu theo mã
    public void xoaTaiLieu() {
        System.out.println("Nhập mã tài liệu cần xóa:");
        int maTaiLieu = sc.nextInt();
        System.out.println(taiLieuList.removeIf(taiLieu -> taiLieu.getId() == maTaiLieu) ? "Xóa thành công" : "Xóa không thành công, kiểm tra lại mã tài liệu");
    }

    // hiển thị
    public void hienThi() {
            System.out.println("\nThông tin sách");
            System.out.println("+----------+----------+----------+--------------------+----------+");
            System.out.println("|     ID   |   TENXB  |    SPH   |        TENTG       |  SOTRANG +");
            System.out.println("+----------+----------+----------+--------------------+----------+");
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof Sach) {
                    int id = taiLieu.getId();
                    String TenXB = taiLieu.getTenNhaXuatBan();
                    String SBH = taiLieu.getSoBanPhatHanh();
                    String TTG = ((Sach) taiLieu).getTenTacGia();
                    int ST = ((Sach) taiLieu).getSoTrang();
                    System.out.printf("| %-8d | %-8s | %-8s | %-18s | %-9d|%n", id, TenXB, SBH, TTG, ST);
                }
            }
            System.out.println("\nThông tin Tạp chí:");
            System.out.println("+----------+----------+----------+--------------------+----------+");
            System.out.println("|     ID   |   TENXB  |    SPH   |         SOPH       |  THANGPH +");
            System.out.println("+----------+----------+----------+--------------------+----------+");
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof TapChi) {
                    int id = taiLieu.getId();
                    String TenXB = taiLieu.getTenNhaXuatBan();
                    String SBH = taiLieu.getSoBanPhatHanh();
                    int SPH = ((TapChi) taiLieu).getSoPhatHanh();
                    LocalDate TPH = ((TapChi) taiLieu).getThangPhatHanh();
                    String format = TPH.toString();
                    System.out.printf("| %-8d | %-8s | %-8s | %-18d | %-9s|%n", id, TenXB, SBH, SPH, format);

                }
            }
            System.out.println("\nThông tin báo: ");
            System.out.println("+----------+----------+----------+----------+");
            System.out.println("|     ID   |   TENXB  |    SPH   |  THANGPH +");
            System.out.println("+----------+----------+----------+----------+");
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof Bao) {
                    int id = taiLieu.getId();
                    String TenXB = taiLieu.getTenNhaXuatBan();
                    String SBH = taiLieu.getSoBanPhatHanh();
                    LocalDate NPH = ((Bao) taiLieu).getNgayPhatHanh();
                    String format = NPH.toString();
                    System.out.printf("| %-8d | %-8s | %-8s | %-9s|%n", id, TenXB, SBH, format);
                }
            }
        }

    // tìm kiếm
    public void timKiem() {
        int menuNumber;
        do {
            System.out.println("Bạn muốn kiếm theo loại nào: ");
            System.out.println("1.  sách");
            System.out.println("2.  Báo chí");
            System.out.println("3.  Báo");
            System.out.println("Chọn menu");

            menuNumber = sc.nextInt();
        } while (menuNumber < 1 || menuNumber > 3 );

        if (menuNumber == 1) {
            System.out.println("+----------+----------+----------+--------------------+----------+");
            System.out.println("|     ID   |   TENXB  |    SPH   |        TENTG       |  SOTRANG +");
            System.out.println("+----------+----------+----------+--------------------+----------+");
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof Sach) {
                    int id = taiLieu.getId();
                    String TenXB = taiLieu.getTenNhaXuatBan();
                    String SBH = taiLieu.getSoBanPhatHanh();
                    String TTG = ((Sach) taiLieu).getTenTacGia();
                    int ST = ((Sach) taiLieu).getSoTrang();
                    System.out.printf("| %-8d | %-8s | %-8s | %-18s | %-9d|%n", id, TenXB, SBH, TTG, ST);
                }
            }
        } else if (menuNumber == 2) {
            System.out.println("+----------+----------+----------+--------------------+----------+");
            System.out.println("|     ID   |   TENXB  |    SPH   |         SOPH       |  THANGPH +");
            System.out.println("+----------+----------+----------+--------------------+----------+");
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof TapChi) {
                    int id = taiLieu.getId();
                    String TenXB = taiLieu.getTenNhaXuatBan();
                    String SBH = taiLieu.getSoBanPhatHanh();
                    int SPH = ((TapChi) taiLieu).getSoPhatHanh();
                    LocalDate TPH = ((TapChi) taiLieu).getThangPhatHanh();
                    String format = TPH.toString();
                    System.out.printf("| %-8d | %-8s | %-8s | %-18d | %-9s|%n", id, TenXB, SBH, SPH, format);
                }
            }
        } else if (menuNumber == 3) {
            System.out.println("+----------+----------+----------+----------+");
            System.out.println("|     ID   |   TENXB  |    SPH   |  THANGPH +");
            System.out.println("+----------+----------+----------+----------+");
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof Bao) {
                    int id = taiLieu.getId();
                    String TenXB = taiLieu.getTenNhaXuatBan();
                    String SBH = taiLieu.getSoBanPhatHanh();
                    LocalDate NPH = ((Bao) taiLieu).getNgayPhatHanh();
                    String format = NPH.toString();
                    System.out.printf("| %-8d | %-8s | %-8s | %-9s|%n", id, TenXB, SBH, format);
                }
            }
        }
    }
}

