package Repo.Dummy;

import Repo.StudentRepo;
import entity.Student;
import entity.StudentDB;
import response.student.GetStudentByIdResponse;
import response.student.GetStudentsByGroupResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRepoRealization implements StudentRepo {
    DataBase db;

    StudentRepoRealization() {
    }

    @Override
    public Student getStudentById(long id) {
        return new Student(db.getStudentMap().get(id).getName(), db.getStudentMap().get(id).getSurname(), db.getStudentMap().get(id).getPatronymic(), db.getStudentMap().get(id).getStatus(), db.getStudentMap().get(id).getId(), db.getGroupMap().get(db.getStudentMap().get(id).getGroupId()));
    }

    @Override
    public void deleteStudentById(long id) {
        db.getStudentMap().remove(id);
    }

    @Override
    public void editStudent(StudentDB student) {
        db.getStudentMap().replace(student.getId(), student);
    }

    @Override
    public long addNewStudent(StudentDB student) {
        long id = 0;
        if (!db.getStudentMap().isEmpty()) {
            id = Collections.max(db.getStudentMap().keySet()) + 1;
        }
        db.getStudentMap().put(id, new StudentDB(student.getName(), student.getSurname(), student.getPatronymic(), student.getStatus(), id, student.getGroupId()));
        return id;
    }

    @Override
    public List<GetStudentByIdResponse> getStudentsByGroupId(long groupId) {
        return db.getStudentMap().values().stream().filter(v -> v.getGroupId() == groupId).map(s -> new GetStudentByIdResponse(new Student(s.getName(), s.getSurname(), s.getPatronymic(), s.getStatus(), s.getId(), db.getGroupMap().get(groupId)))).collect(Collectors.toList());
    }

    @Override
    public List<Student> getAllStudents() {
        return db.getStudentMap().values().stream().map(s -> new Student(s.getName(), s.getSurname(), s.getPatronymic(), s.getStatus(), s.getId(),db.getGroupMap().get(s.getGroupId()))).collect(Collectors.toList());
    }
}
