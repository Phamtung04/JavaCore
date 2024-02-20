package assignment.Exercise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm can bộ");
            System.out.println("2. hiển thị");
            System.out.println("3. thoát");
            System.out.println("4. tìm kiếm theo họ tên");
            System.out.println("5. xóa theo ten");
            System.out.println("Chọn chức năng");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                themCanBo();
            } else if (menu.equals("2")) {
                hienThiDSCB();
            } else if (menu.equals("3")) {
                return;
            } else if (menu.equals("4")) {
                timKiemTheoHoTen();
            }else  if (menu.equals("5")) {
                xoaCanBoTheoTen();
            } else {
                    System.out.println("Nhập lại");
            }
        }
    }

    public void themCanBo() {
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("Chọn menu:");
        String menu = sc.nextLine();
        if (menu.equals("1")) {
            System.out.println("Nhập vào họ tên:");
            String hoTen = sc.nextLine();
            System.out.println("Nhập vào tuổi:");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào giới tính (NAM, NU, KHAC):");
            Gender gioiTinh = Gender.valueOf(sc.nextLine());
            System.out.println("Nhập vào địa chỉ:");
            String diaChi = sc.nextLine();
            System.out.println("Nhập vào bậc(1 - 10):");
            int bac = Integer.parseInt(sc.nextLine());
            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            canBoList.add(congNhan);
        } else if (menu.equals("2")) {
            System.out.println("Nhập vào họ tên:");
            String hoTen = sc.nextLine();
            System.out.println("Nhập vào tuổi:");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào giới tính (NAM, NU, KHAC):");
            Gender gioiTinh = Gender.valueOf(sc.nextLine());
            System.out.println("Nhập vào địa chỉ:");
            String diaChi = sc.nextLine();
            System.out.println("Nhập vào ngành đào tạo:");
            String daoTao = sc.nextLine();
            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, daoTao);
            canBoList.add(kySu);
        } else {
            System.out.println("Nhập vào họ tên:");
            String hoTen = sc.nextLine();
            System.out.println("Nhập vào tuổi:");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào giới tính (NAM, NU, KHAC):");
            Gender gioiTinh = Gender.valueOf(sc.nextLine());
            System.out.println("Nhập vào địa chỉ:");
            String diaChi = sc.nextLine();
            System.out.println("Nhập công việc:");
            String congViec = sc.nextLine();
            NhanVien nhanVien =new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            canBoList.add(nhanVien);
        }
    }

    public void hienThiDSCB() {
        System.out.println("+--------------------+----------+----------+--------------------+");
        System.out.println("|           HỌ TÊN   |   TUOI   |GIOI TINH |        ĐỊA CHỈ     |");
        System.out.println("+--------------------+----------+----------+--------------------+");
        for (CanBo canBo : canBoList) {
            String hoTen = canBo.getFullName();
            int tuoi = canBo.getAge();
            Gender gioiTinh = canBo.getGender();
            String diaChi = canBo.getAddress();
            System.out.printf(
                    "| %-18s | %-8d | %-9s | %-18s |%n",
                    hoTen, tuoi, gioiTinh, diaChi
            );

        }
    }

    public void timKiemTheoHoTen() {
        System.out.println("Nhập vào họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("+--------------------+----------+----------+--------------------+");
        System.out.println("|           HỌ TÊN   |   TUOI   |GIOI TINH |        ĐỊA CHỈ     |");
        System.out.println("+--------------------+----------+----------+--------------------+");
        for (CanBo canBo : canBoList) {
            if (!canBo.getFullName().equals(hoTen)) {
                continue;
            }
            int tuoi = canBo.getAge();
            Gender gioiTinh = canBo.getGender();
            String diaChi = canBo.getAddress();
            System.out.printf(
                    "| %-18s | %-8d | %-9s | %-18s |%n",
                    hoTen, tuoi, gioiTinh, diaChi
            );
        }
    }

    public void  xoaCanBoTheoTen() {
        System.out.println("Nhập vào tên: ");
        String ten  = sc.nextLine();
       // System.out.println(canBoList.removeIf(staff -> staff.getFullName().equals(ten)) ? "Xóa thành công" : "xóa chưa thành công");
        canBoList.removeIf(new Predicate<CanBo>() {
            @Override
            public boolean test(CanBo canBo) {
                String hoTen = canBo.getFullName();
                int indexOfLastSpace = hoTen.lastIndexOf(' ');
                String lastName = hoTen.substring(indexOfLastSpace + 1);
                return lastName.equals(ten);
            }
        });
    }
}
