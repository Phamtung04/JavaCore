package assignment.Testing05.Exercise01.Question02;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private List<ThiSinh> thiSinhList = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void themThiSinh() {
        System.out.println("Nhập vào SBD:");
        String SBD = sc.nextLine();
        System.out.println("nhập họ tên:");
        String ten = sc.nextLine();
        System.out.println("nhập địa chỉ:");
        String diaChi = sc.nextLine();
        System.out.println("nhạp ưu tiên:");
        String uuTien = sc.nextLine();
        System.out.println("Nhập khối thi(A/B/C) ");
        String khoiThi = sc.nextLine();
        ThiSinh thiSinh;
        if (khoiThi.equals("A")) {
            thiSinh = new ThiSinhA(SBD, ten, diaChi, uuTien);
        } else if (khoiThi.equals("B")) {
            thiSinh = new ThiSinhB(SBD, ten, diaChi, uuTien);
        } else {
            thiSinh = new ThiSinhC(SBD, ten, diaChi, uuTien);
        }
        thiSinhList.add(thiSinh);
    }

    @Override
    public void hienThiTSTSBD() {
        System.out.println("Danh sách thí sinh:");
        System.out.println("+-------------+--------------------+--------------------+-------------+--------------------+");
        System.out.println("|    SBD      |      HOTEN         |      DIACHI        |   UUTIEN    |     MONTHI         |");
        System.out.println("+-------------+--------------------+--------------------+-------------+--------------------+");
        for (ThiSinh thiSinh : thiSinhList) {
            String SBD = thiSinh.getSBD();
            String ten = thiSinh.getTen();
            String diaChi = thiSinh.getDiaChi();
            String uuTien = thiSinh.getMucUuTien();
            String monThi = thiSinh.getMonThi();
            System.out.printf("| %-11s | %-18s | %-18s | %-11s | %-18s |%n", SBD, ten, diaChi, uuTien, monThi);

            System.out.println("+-------------+--------------------+--------------------+-------------+--------------------+");
        }
    }

    @Override
    public void timKiemTSBD() {
        System.out.println("Nhập SBD cần tìm:");
        String SBD = sc.nextLine();
        System.out.println("+-------------+--------------------+--------------------+-------------+--------------------+");
        System.out.println("|    SBD      |      HOTEN         |      DIACHI        |   UUTIEN    |     MONTHI         |");
        System.out.println("+-------------+--------------------+--------------------+-------------+--------------------+");
        for (ThiSinh thiSinh : thiSinhList) {
            if (thiSinh.getSBD().equals(SBD)) {
                String ten = thiSinh.getTen();
                String diaChi = thiSinh.getDiaChi();
                String uuTien = thiSinh.getMucUuTien();
                String monThi = thiSinh.getMonThi();
                System.out.printf("| %-11s | %-18s | %-18s | %-11s | %-18s |%n", SBD, ten, diaChi, uuTien, monThi);
                System.out.println("+-------------+--------------------+--------------------+-------------+--------------------+");
            }
        }
    }

    public void show() {
        while (true) {
            System.out.println("Thêm");
            System.out.println("hiển thị");
            System.out.println("tìm kiếm");
            System.out.println("thoát");
            System.out.println("Chọn chức năng");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                themThiSinh();
            } else if (menu.equals("2")) {
                hienThiTSTSBD();
            } else if (menu.equals("3")) {
                timKiemTSBD();
            } else if (menu.equals("4")) {
                return;
            } else {
                System.out.println("Nhập lại");
            }
        }
    }
}
