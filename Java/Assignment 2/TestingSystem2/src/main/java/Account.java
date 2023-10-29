import java.util.Date;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    Date createDate;
    Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
