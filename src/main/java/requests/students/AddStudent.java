package requests.students;

public class AddStudent {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final long groupId;
    private final String status;

    public AddStudent(String lastName, String firstName, String middleName, long groupId, String status) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = middleName;
        this.groupId = groupId;
        this.status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getStatus() {
        return status;
    }
}
