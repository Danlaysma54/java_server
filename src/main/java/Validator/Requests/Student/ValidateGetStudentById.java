package Validator.Requests.Student;

import Validator.Requests.Validator;
import requests.students.GetStudentById;
import Validator.ValidateId;

import java.util.ArrayList;
import java.util.List;

public class ValidateGetStudentById implements Validator<GetStudentById> {
    @Override
    public List<String> validate(GetStudentById smth) {
        List<String> errors = new ArrayList<>();
        if (ValidateId.validate(smth.getId())) {
            errors.add("Illegal id");
        }
        return errors;
    }
}
