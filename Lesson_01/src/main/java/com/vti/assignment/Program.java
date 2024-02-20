package com.vti.assignment;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;


public class Program {
    public static void main(String[] args) {
        // Question 2: =================================================
        // insert Department
        Department depa1 = new Department();
        depa1.departmentId = 1;
        depa1.departmentName = "sale";

        Department depa2 = new Department();
        depa2.departmentId = 2;
        depa2.departmentName = "giám đốc";

        Department depa3 = new Department();
        depa3.departmentId = 3;
        depa3.departmentName = "marketing";

        // insert position
        Position pos1 = new Position();
        pos1.Position_ID = 1;
        pos1.name = PostionName.DEV;

        Position pos2 = new Position();
        pos2.Position_ID = 2;
        pos2.name = PostionName.TEST;

        Position pos3 = new Position();
        pos3.Position_ID = 3;
        pos3.name = PostionName.PM;
        // insert group
        Group group1 = new Group();
        group1.group_id = 1;
        group1.group_name = "sale";
        group1.create_date = LocalDate.now();
        group1.accounts = new account[]{};

        Group group2 = new Group();
        group2.group_id = 2;
        group2.group_name = "marketing";
        group2.create_date = LocalDate.now();
        group2.accounts = new account[]{};

        Group group3 = new Group();
        group3.group_id = 3;
        group3.group_name = "Dev";
        group3.create_date = LocalDate.now();
        group3.accounts = new account[]{};

        // insert account
        account acc1 = new account();
        acc1.accountId = 1;
        acc1.email = "user1@gmail.com";
        acc1.Username = "User1";
        acc1.fullName = "User1";
        acc1.department = depa1;
        acc1.position = pos1;
        acc1.Create_Date = LocalDate.now();
        acc1.groups =  new Group[]{group2, group1};


        account acc2 = new account();
        acc2.accountId = 1;
        acc2.email = "user2@gmail.com";
        acc2.Username = "User2";
        acc2.fullName = "User2";
        acc2.department = depa2;
        acc2.position = pos2;
        acc2.Create_Date = LocalDate.now();
        acc2.groups =  new Group[]{group1, group2, group3};

        account acc3 = new account();
        acc3.accountId = 3;
        acc3.email = "user3@gmail.com";
        acc3.Username = "User3";
        acc3.fullName = "User3";
        acc3.department = depa3;
        acc3.position = pos3;
        acc3.Create_Date = LocalDate.now();
        acc3.groups =  new Group[]{group3};



        // insert Typy_question
        type_question typeQ1 = new type_question();
        typeQ1.type_id = 1;
        typeQ1.name = type_question.type_name.Essay;

        type_question typeQ2 = new type_question();
        typeQ2.type_id = 2;
        typeQ2.name = type_question.type_name.Multiple_choice;

        type_question typeQ3 = new type_question();
        typeQ3.type_id = 3;
        typeQ3.name = type_question.type_name.Essay;

        // insret category_question
        category_question cat1 = new category_question();
        cat1.categoryId = 1;
        cat1.categoryName = "java";

        category_question cat2 = new category_question();
        cat2.categoryId = 2;
        cat2.categoryName = ".NET";

        category_question cat3 = new category_question();
        cat3.categoryId = 3;
        cat3.categoryName = "SQL";

        // insert question
        question ques1 = new question();
        ques1.question_id = 1;
        ques1.content = "Câu hỏi 1";
        ques1.category = cat1;
        ques1.type = typeQ1;
        ques1.creator = acc1;
        ques1.create_date = LocalDate.now();

        question ques2 = new question();
        ques2.question_id = 2;
        ques2.content = "Câu hỏi 2";
        ques2.category = cat2;
        ques2.type = typeQ2;
        ques2.creator = acc2;
        ques2.create_date = LocalDate.now();

        question ques3 = new question();
        ques3.question_id = 3;
        ques3.content = "Câu hỏi 3";
        ques3.category = cat3;
        ques3.type = typeQ3;
        ques3.creator = acc3;
        ques3.create_date = LocalDate.now();

        // insret answer
        answer an1 = new answer();
        an1.answerId = 1;
        an1.content = "Câu trả lời 1";
        an1.question = ques1;
        an1.isCorrect = true;

        answer an2 = new answer();
        an2.answerId = 2;
        an2.content = "Câu trả lời 2";
        an2.question = ques2;
        an2.isCorrect = false;

        answer an3 = new answer();
        an3.answerId = 3;
        an3.content = "Câu trả lời 3";
        an3.question = ques3;
        an3.isCorrect = true;

        // insret exam
        exam exam1 = new exam();
        exam1.examId = 1;
        exam1.code = "1234";
        exam1.title = "Tiêu đề 1";
        exam1.category = cat1;
        exam1.duration = 60;
        exam1.creator = acc1;
        exam1.createDate = LocalDate.now();

        exam exam2 = new exam();
        exam2.examId = 2;
        exam1.code = "12343";
        exam2.title = "Tiêu đề 2";
        exam2.category = cat2;
        exam2.duration = 90;
        exam2.creator = acc2;
        exam2.createDate = LocalDate.now();

        exam exam3 = new exam();
        exam3.examId = 3;
        exam3.code = "12344";
        exam3.title = "Tiêu đề 3";
        exam3.category = cat3;
        exam3.duration = 120;
        exam3.creator = acc3;
        exam3.createDate = LocalDate.now();

        // insert examQuestion
        exam_question exp1 = new exam_question();
        exp1.exam = exam1;
        exp1.question = ques1;

        exam_question exp2 = new exam_question();
        exp2.exam = exam2;
        exp2.question = ques3;

        // Question 3: ======================================
        System.out.println("Thông tin các Account trên hệ thống:");
        System.out.println("Account 1: ID : " + acc2.accountId
                        + " /Email: " + acc2.email
                        + " /UserName: " + acc2.Username
                        + " /FullName: " + acc2.fullName
                        + " /Department: " + acc2.department.departmentName
                        + " /Position: " + acc2.position.name
                        + " /Group: " + group3.group_name
                        + " /CreateDate: " + acc2.Create_Date);

        acc1.ttt();

    }

}
