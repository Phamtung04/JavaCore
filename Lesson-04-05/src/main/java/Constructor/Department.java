package Constructor;

public class Department {
    int      id;
    String  name;

    Department () {
        System.out.println("khỏi tạo phòng ban không tham số");
    }

    Department (String name) {
        System.out.println("khỏi tạo phòng ban 1 tham số name");
        this.name = name;
    }

}
