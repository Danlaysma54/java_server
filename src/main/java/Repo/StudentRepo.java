package Repo;

import entity.Group;
import entity.Student;
import entity.StudentDB;
import response.student.GetStudentByIdResponse;

import java.util.List;

public interface StudentRepo {
    public void deleteStudentById(long id);

    public void editStudent(StudentDB student);

    public long addNewStudent(StudentDB student); //на входе сущность с id = null, сущность добавляется в хранилище, при этом ей назначается значение id, этот id возвращается как результат

    public Student getStudentById(long id);

    public List<Student> getAllStudents();

    public  List<GetStudentByIdResponse> getStudentsByGroupId(long groupId);
}
