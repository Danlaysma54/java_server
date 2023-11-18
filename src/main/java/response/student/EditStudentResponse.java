package response.student;

import entity.Student;
import requests.students.EditStudent;

public class EditStudentResponse {
    private String name;
    private String surname;
    private String patronymic;
    private String status;
    private long id;
    private String group;

    public EditStudentResponse(String name, String surname, String patronymic, String status, long id, String group) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.status = status;
        this.id = id;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getStatus() {
        return status;
    }

    public long getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", status='" + status + '\'' +
                ", id=" + id +
                ", group='" + group + '\'' +;
    }
}
