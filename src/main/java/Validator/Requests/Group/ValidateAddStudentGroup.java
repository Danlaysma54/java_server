package Validator.Requests.Group;

import Validator.Requests.Validator;
import requests.group.AddStudentGroup;
import Validator.ValidateString;

import java.util.ArrayList;
import java.util.List;

public class ValidateAddStudentGroup implements Validator<AddStudentGroup> {
    @Override
    public  List<String> validate(AddStudentGroup smth) {
        List<String> errors =new ArrayList<>();
        if(ValidateString.IsEmpty(smth.getName())){
            errors.add("Empty name");
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
