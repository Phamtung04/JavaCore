package assignment.Exercise06;

public class Contacts {
    private String name;
    private String phone;
    public Contacts() {}

    public Contacts(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "phone='" + name + '\'' +
                ", name='" + phone + '\'' +
                '}';
    }
}
