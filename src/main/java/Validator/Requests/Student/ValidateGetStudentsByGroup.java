package Validator.Requests.Student;

import Validator.Requests.Validator;
import requests.students.GetStudentsByGroup;
import Validator.ValidateId;

import java.util.ArrayList;
import java.util.List;

public class ValidateGetStudentsByGroup implements Validator<GetStudentsByGroup> {
    @Override
    public List<String> validate(GetStudentsByGroup smth) {
        List<String> errors = new ArrayList<>();
        if (ValidateId.validate(smth.getGroupId())) {
            errors.add("Illegal group ID");
        }
        return errors;
    }
}
