package response.student;

import entity.Student;

import java.util.List;

public class GetAllStudentsResponse {
    List<Student> students;

    public GetAllStudentsResponse(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Student student : students) {
            str.append(student.toString());
        }
        return str.toString();
    }
}
