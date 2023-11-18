package entity;

public class StudentDB {
    private String name;
    private String surname;
    private String patronymic;



    private Student.Status status;
    private long id;
    private long groupId;

    public StudentDB(String name, String surname, String patronymic, Student.Status status, long id, long groupId) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.status = status;
        this.id = id;
        this.groupId = groupId;
    }

    public long getId() {
        return id;
    }

    public Student.Status getStatus() {
        return status;
    }

    public void setStatus(Student.Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public long getGroupId() {
        return groupId;
    }

    public boolean equals(StudentDB student) {
        return this.surname.equals(student.getSurname()) && this.name.equals(student.getName()) && this.patronymic.equals(student.getPatronymic()) && this.status == student.status && this.id == student.getId();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.patronymic.hashCode() + this.status.hashCode() + (int) this.getId();
    }
}
