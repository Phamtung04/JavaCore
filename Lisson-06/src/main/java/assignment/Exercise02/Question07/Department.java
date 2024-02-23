package assignment.Exercise02.Question07;

public class Department {
    private int id;
    private String name;

    public Department() {
        System.out.println("Nhập thông tin phòng ban: ");
        ScannerUtils utils = new ScannerUtils();

        System.out.println("Nhập vào id: ");
        this.id = utils.inputInt();

        System.out.println("Nhập vào name: ");
        this.name = utils.inputString();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
