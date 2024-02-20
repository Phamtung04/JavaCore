package assignment.Exercise_01;

import assignment.*;

public class Exercise_01 {
    public void Question_01(){
        Department de = new Department();
        de.departmentName = "sale";

        Account acc = new Account();
        acc.department = de;

        if (acc.department.departmentName ==  null) {
            System.out.println("Phòng ban này không có nhân viên ");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + acc.department.departmentName);
        }
    }

    public void Question_02(){
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group[] groups = {group1, group2, group3};
        System.out.println("groups.length = " + groups.length);
        if (groups.length == 0) {
            System.out.println("Chưa tham gia group");
        } else if (groups.length == 1 || groups.length == 2) {
            System.out.println("Nhân viên quan trọng, tham gia nhiều group");
        }else {
            System.out.println("Nhân viên này là người honng chuyện");
        }
    }

    public void Question_03(){
        Department de = new Department();
        de.departmentName = "sale";

        Account acc = new Account();
        acc.department = de;

        System.out.println(acc.department.departmentName == null ? "Phòng ban này không có nhân viên" : "Phòng ban của nhân viên này là: " + acc.department.departmentName);
    }

    public void Question_04(){
        Position Pos = new Position();
        Pos.postionName = namePosition.Dev;

        Account acc = new Account();
        acc.position = Pos;

        System.out.println(acc.position.postionName.toString() == "Dev" ? "đấy là developer" : "Người này khồng phải");
    }

    public void Question_05(){
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group[] groups = {group1, group2, group3};

        switch (groups.length){
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }

    public void Question_06(){
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group[] groups = {group1, group2, group3};
        System.out.println("groups.length = " + groups.length);
        switch (groups.length) {
            case 0 -> System.out.println("Chưa tham gia group");
            case 1, 2 -> System.out.println("Nhân viên quan trọng, tham gia nhiều group");
            default -> System.out.println("Nhân viên này là người honng chuyện");
        }
    }

    public void Question_07(){
        Position Pos = new Position();
        Pos.postionName = namePosition.Dev;

        Account acc = new Account();
        acc.position = Pos;


    }
}
