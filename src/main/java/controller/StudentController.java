package controller;

import Validator.Requests.Student.*;
import entity.Student;
import response.CommonResponse;
import response.ResponseEntity;
import response.student.*;
import requests.students.*;
import service.student.StudentService;

import java.util.ArrayList;

public class StudentController {
    ValidateAddStudent validateAddStudent;
    ValidateDeleteStudent validateDeleteStudent;
    ValidateEditStudent validateEditStudent;
    ValidateGetStudentById validateGetStudentById;
    ValidateGetStudentsByGroup validateGetStudentsByGroup;
    StudentService studentService;

    public ResponseEntity<CommonResponse<AddStudentResponse>> addStudent(AddStudent request) {
        CommonResponse<AddStudentResponse> commonResponse;
        if (validateAddStudent.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(studentService.addStudentService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateAddStudent.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }

    public ResponseEntity<CommonResponse<GetStudentByIdResponse>> getStudentById(GetStudentById request) {
        CommonResponse<GetStudentByIdResponse> commonResponse;
        if (validateGetStudentById.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(studentService.getStudentByIdService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateGetStudentById.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }

    public ResponseEntity<CommonResponse<String>> deleteStudent(DeleteStudent request) {
        CommonResponse<String> commonResponse;
        if (validateDeleteStudent.validate(request).isEmpty()) {
            studentService.deleteStudentById(request);
            commonResponse = new CommonResponse<>("Everything is ok");
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateDeleteStudent.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }

    public ResponseEntity<CommonResponse<EditStudentResponse>> editStudent(EditStudent request) {
        CommonResponse<EditStudentResponse> commonResponse;
        if (validateEditStudent.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(studentService.editStudentService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateEditStudent.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }

    public ResponseEntity<CommonResponse<GetStudentsByGroupResponse>> getStudentByGroup(GetStudentsByGroup request) {
        CommonResponse<GetStudentsByGroupResponse> commonResponse;
        if (validateGetStudentsByGroup.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(studentService.getStudentByGroupService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateGetStudentsByGroup.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }
}
