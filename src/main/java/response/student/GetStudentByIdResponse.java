package response.student;

import entity.Student;

public class GetStudentByIdResponse {

    private String name;
    private String surname;
    private String patronymic;
    private String status;
    private long id;

    public GetStudentByIdResponse(Student student) {
        this.name = student.getName();
        this.surname = student.getSurname();
        this.patronymic = student.getPatronymic();
        this.status = student.getStatus().toString();
        this.id = student.getId();
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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", status='" + status + '\'' +
                ", id=" + id;
    }
}
