package assignment.Exercise05;

public class CongNhan extends CanBo{
    private int rank;
    public CongNhan() {}

    public CongNhan(int rank) {
        this.rank = rank;
    }

    public CongNhan(String fullName, int age, Gender gender, String address, int rank) {
        super(fullName, age, gender, address);
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "rank=" + rank +
                '}';
    }

}
