package com.vti.assignment;

import java.time.LocalDate;
public class account {
    public  int        accountId;
    public  String     email;
    public  String     Username;
    public  String     fullName;
    public Department department;
    public Position position;
    public  LocalDate  Create_Date;
    public Group[] groups;

    void ttt(){
        System.out.println(department.departmentName);
    }
}
