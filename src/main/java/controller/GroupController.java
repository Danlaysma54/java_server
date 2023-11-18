package controller;

import Validator.Requests.Group.*;
import requests.group.*;
import response.CommonResponse;
import response.ResponseEntity;
import response.group.*;
import service.group.GroupService;

public class GroupController {
    ValidateAddStudentGroup validateAddStudentGroup;
    ValidateDeleteStudentGroup validateDeleteStudentGroup;
    ValidateEditStudentGroup validateEditStudentGroup;
    ValidateGetStudentsGroupById validateGetStudentById;
    GroupService groupService;

    public ResponseEntity<CommonResponse<AddStudentGroupResponse>> addStudentGroup(AddStudentGroup request) {
        CommonResponse<AddStudentGroupResponse> commonResponse;
        if (validateAddStudentGroup.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(groupService.addStudentGroupService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateAddStudentGroup.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }

    public ResponseEntity<CommonResponse<Void>> deleteStudentGroup(DeleteStudentGroup request) {
        CommonResponse<String> commonResponse;
        if (validateDeleteStudentGroup.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>("Everything is ok");
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateDeleteStudentGroup.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }

    public ResponseEntity<CommonResponse<EditStudentGroupResponse>> editStudentGroup(EditStudentGroup request) {
        CommonResponse<EditStudentGroupResponse> commonResponse;
        if (validateEditStudentGroup.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(groupService.editStudentGroupService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateEditStudentGroup.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }


    public ResponseEntity<CommonResponse<GetStudentGroupByIdResponse>> g2tStudentByGroup(GetStudentGroupById request) {
        CommonResponse<GetStudentGroupByIdResponse> commonResponse;
        if (validateGetStudentById.validate(request).isEmpty()) {
            commonResponse = new CommonResponse<>(groupService.getStudentGroupByIdService(request));
        } else {
            commonResponse = new CommonResponse<>("ErrorMessage", 422, validateGetStudentById.validate(request));
        }
        return new ResponseEntity<>(commonResponse.toString(), 200);
    }
}
