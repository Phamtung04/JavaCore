package assignment.Exercise05;

public class NhanVien extends CanBo {
    private String task;
    public NhanVien() {}

    public NhanVien(String task) {
        this.task = task;
    }

    public NhanVien(String fullName, int age, Gender gender, String address, String task) {
        super(fullName, age, gender, address);
        this.task = task;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "task='" + task + '\'' +
                '}';
    }
}
