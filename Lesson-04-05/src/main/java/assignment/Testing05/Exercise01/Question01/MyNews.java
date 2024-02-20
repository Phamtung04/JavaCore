package assignment.Testing05.Exercise01.Question01;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
        private Scanner sc = new Scanner(System.in);
        private ArrayList<New> newArrayList = new ArrayList<>();

        public void insertNews() {
            System.out.println("ID");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("title");
             String title = sc.nextLine();
            System.out.println("publishDate");
            String publishDate = sc.nextLine();
            System.out.println("author");
            String author = sc.nextLine();
            System.out.println("content");
            String content = sc.nextLine();
            System.out.println("rates1");
            int rates1 = sc.nextInt();
            System.out.println("rates2");
            int rates2 = sc.nextInt();
            System.out.println("rates3");
            int rates3 = sc.nextInt();
            int[] rates = {rates1, rates2, rates3};
            New news = new New(id, title, publishDate, author, content, rates);
            newArrayList.add(news);
        }

        public void viewListNews() {
            for (New aNew : newArrayList) {
                aNew.display();
            }
        }

        public void Averagerate() {
            for (New aNew : newArrayList) {
                System.out.println("\ntitle " + aNew.getTitle() + " rates " + aNew.calculate());
            }
        }

        public void showNews() {
            System.out.println("danh sách News:");
            System.out.println("+-----+----------+---------------+---------------+---------------+--------+--------+--------+");
            System.out.println("| ID  |  Title   |  PublishDate  |   author      |   content     | rates1 | rates2 | rates3 |");
            System.out.println("+-----+----------+---------------+---------------+---------------+--------+--------+--------+");
            for (New aNew : newArrayList) {
                int id = aNew.getId();
                String title = aNew.getTitle();
                String publishDate = aNew.getPublishDate();
                String author = aNew.getAuthor();
                String content = aNew.getContent();
                int rates1 = aNew.getRates()[0];
                int rates2 = aNew.getRates()[1];
                int rates3 = aNew.getRates()[2];

                System.out.printf("| %-3d | %-8s | %-13s | %-13s | %-13s | %-6d | %-6d | %-6d |", id, title, publishDate, author, content, rates1, rates2, rates3);
            }
        }

        public void show() {
            while (true) {
                System.out.println("\n1. insert");
                System.out.println("2. view list news");
                System.out.println("3. show table");
                System.out.println("4. Averagerate");
                System.out.println("5 thoát");
                int menu = sc.nextInt();
                if (menu == 1) {
                    insertNews();
                } else if (menu == 2) {
                    viewListNews();
                } else if (menu == 3) {
                    showNews();
                } else if (menu == 4) {
                    Averagerate();
                } else if (menu == 5) {
                    return;
                }else {
                    System.out.println("Nhập lại....");
                }
            }
        }

}
