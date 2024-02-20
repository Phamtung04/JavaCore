package assignment;

public class Program {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.departmentId = 1;
        d1.departmentName="Giám Đốc";
        Department d2 = new Department();
        d2.departmentId = 2;
        d2.departmentName = "Sale";
        Department d3 = new Department();
        d3.departmentId=3;
        d3.departmentName = "Marketing";
        d1.outInfo();
        d2.outInfo();
        d3.outInfo();
        Position p1 = new Position();
        p1.positionId = 1;
        p1.postionName = namePosition.PM;
        Account a1 = new Account();
        a1.accountId = 1;
        a1.email = "linh@gmail.com";
        a1.fullName= "Nguyễn Văn Linh";
        a1.userName= "Linh";
        a1.department = d1;
        a1.position = p1;
        a1.outAccount();

    }
}
