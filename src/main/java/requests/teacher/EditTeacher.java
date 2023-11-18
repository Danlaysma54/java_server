package requests.teacher;

import entity.Student;

public class EditTeacher {
    private String name;
    private String surname;
    private String patronymic;
    private long id;

    public EditTeacher(String name, String surname, String patronymic, Student.Status status, long id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.id = id;
    }

    public long getId() {
        return id;
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
        return this.surname.equals(student.getSurname()) && this.name.equals(student.getName()) && this.patronymic.equals(student.getPatronymic()) && this.id == student.getId();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.patronymic.hashCode() + (int) this.getId();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", id=" + id;
    }
}
