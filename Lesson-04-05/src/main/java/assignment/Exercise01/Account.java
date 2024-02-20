package assignment.Exercise01;

public class Account {
    private int id;
    private String email;
    private String userame;
    private String firstName;
    private String lastName;
    private String fullName;

    public Account(){}

    public Account(int id, String email, String userame, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userame = userame;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
    }
}
