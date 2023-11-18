package response.student;

import entity.Student;

import java.util.List;

public class GetStudentsByGroupResponse {
    List<GetStudentByIdResponse> students;

    public GetStudentsByGroupResponse(List<GetStudentByIdResponse> students) {
        this.students = students;
    }

    public List<GetStudentByIdResponse> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (GetStudentByIdResponse student : students) {
            str.append(student.toString());
        }
        return str.toString();
    }
}
