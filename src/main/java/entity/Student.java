package entity;

public class Student {
    private String name;
    private String surname;
    private String patronymic;

    public enum Status {
        STUDYING, VACATION, DISMISSED
    }

    private Status status;
    private long id;
    private Group group;


    public Student(String name, String surname, String patronymic, Status status, long id, Group group) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.status = status;
        this.id = id;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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

    public boolean equals(Student student) {
        return this.surname.equals(student.getSurname()) && this.name.equals(student.getName()) && this.patronymic.equals(student.getPatronymic()) && this.status == student.status && this.id == student.getId();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.patronymic.hashCode() + this.status.hashCode() + (int) this.getId();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", status=" + status +
                ", id=" + id +
                ", group=" + group;
    }
}
