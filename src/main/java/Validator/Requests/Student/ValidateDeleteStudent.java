package Validator.Requests.Student;
import Validator.Requests.Validator;
import Validator.ValidateId;
import requests.students.DeleteStudent;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteStudent implements Validator<DeleteStudent> {
    @Override
    public List<String> validate(DeleteStudent smth) {
        List<String> errors =new ArrayList<>();
        if(!ValidateId.validate(smth.getId())){
            errors.add("Illegal ID");
        }
        return errors;
    }
}
