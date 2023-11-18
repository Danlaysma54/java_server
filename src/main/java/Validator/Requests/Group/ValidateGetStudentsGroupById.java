package Validator.Requests.Group;

import Validator.Requests.Validator;
import requests.group.GetStudentGroupById;
import Validator.ValidateId;

import java.util.ArrayList;
import java.util.List;

public class ValidateGetStudentsGroupById implements Validator<GetStudentGroupById> {
    @Override
    public List<String> validate(GetStudentGroupById smth) {
        List<String> errors = new ArrayList<>();
        if (ValidateId.validate(smth.getId())) {
            errors.add("Illegal ID");
        }
        return errors;
    }
}
