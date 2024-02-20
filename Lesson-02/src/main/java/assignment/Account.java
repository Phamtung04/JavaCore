package assignment;

import java.time.LocalDate;

public class Account {
    public int accountId;
    public Department department;
    public Position position;
    public String email, userName, fullName;
    public LocalDate createDate;
    public void outAccount(){
        System.out.println("ID: "+accountId);
        System.out.println("Department: "+department.departmentId);
        System.out.println("Position: "+position.positionId);
        System.out.println("Email"+email);
        System.out.println("User Name: "+userName);
        System.out.println("Full Name: "+fullName);
        System.out.println("Create Date: "+createDate);
    }
}
