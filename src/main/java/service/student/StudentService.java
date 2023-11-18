package service.student;

import Repo.Dummy.GroupRepoRealization;
import Repo.Dummy.StudentRepoRealization;
import entity.Student;
import entity.StudentDB;
import requests.students.*;
import response.student.*;

public class StudentService {
    private StudentRepoRealization studentRepoRealization;
    private GroupRepoRealization groupRepoRealization;

    public AddStudentResponse addStudentService(AddStudent request) {
        return new AddStudentResponse(studentRepoRealization.addNewStudent(new StudentDB(request.getFirstName(), request.getLastName(), request.getLastName(), Student.Status.valueOf(request.getStatus()), 0, request.getGroupId())));
    }

    public EditStudentResponse editStudentService(EditStudent request) {
        studentRepoRealization.editStudent(new StudentDB(request.getFirstName(), request.getLastName(), request.getLastName(), Student.Status.valueOf(request.getStatus()), 0, request.getGroupId()));
        return new EditStudentResponse(request.getFirstName(), request.getLastName(), request.getLastName(), request.getStatus(), request.getId(), groupRepoRealization.getGroupById(request.getGroupId()).toString());
    }

    public GetStudentsByGroupResponse getStudentByGroupService(GetStudentsByGroup request) {
        return new GetStudentsByGroupResponse(studentRepoRealization.getStudentsByGroupId(request.getGroupId()));
    }

    public GetStudentByIdResponse getStudentByIdService(GetStudentById request) {
        studentRepoRealization.getStudentById(request.getId());
        return new GetStudentByIdResponse(studentRepoRealization.getStudentById(request.getId()));
    }

    public void deleteStudentById(DeleteStudent request) {
        studentRepoRealization.deleteStudentById(request.getId());
    }

    public GetAllStudentsResponse getAllStudentsService() {
        return new GetAllStudentsResponse(studentRepoRealization.getAllStudents());

    }
}
