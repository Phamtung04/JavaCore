package assignment.Exercise05;

public class KySu extends CanBo {
    private String specializedtraining;
    public KySu(){}

    public KySu(String specializedtraining) {
        this.specializedtraining = specializedtraining;
    }

    public KySu(String fullName, int age, Gender gender, String address, String specializedtraining) {
        super(fullName, age, gender, address);
        this.specializedtraining = specializedtraining;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "specializedtraining='" + specializedtraining + '\'' +
                '}';
    }
}
