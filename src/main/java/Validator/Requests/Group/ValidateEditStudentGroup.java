package Validator.Requests.Group;

import Validator.Requests.Validator;
import requests.group.EditStudentGroup;
import Validator.ValidateId;
import Validator.ValidateString;

import java.util.ArrayList;
import java.util.List;

public class ValidateEditStudentGroup implements Validator<EditStudentGroup> {
    @Override
    public List<String> validate(EditStudentGroup smth) {
        List<String> errors = new ArrayList<>();
        if (ValidateId.validate(smth.getId())) {
            errors.add("Illegal ID");
        }
        if (ValidateString.IsEmpty(smth.getName())) {
            errors.add("Empty Name");
        }
        if(ValidateString.IsNull(smth.getName())){
            errors.add("Name address is null");
        }
        if(ValidateString.IsTooLong(smth.getName())){
            errors.add("Too long name");
        }
        return errors;
    }
}
