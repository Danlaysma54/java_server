package Validator.Requests.Group;

import Validator.Requests.Validator;
import requests.group.DeleteStudentGroup;
import Validator.ValidateId;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteStudentGroup implements Validator<DeleteStudentGroup> {
    @Override
    public List<String> validate(DeleteStudentGroup smth) {
        List<String> errors = new ArrayList<>();
        if (ValidateId.validate(smth.getId())) {
            errors.add("Illegal ID");
        }
        return errors;
    }
}
