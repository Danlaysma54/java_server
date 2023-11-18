package Validator.Requests.Student;


import Validator.Requests.Validator;
import requests.students.AddStudent;
import Validator.ValidateString;
import Validator.ValidateId;

import java.util.ArrayList;
import java.util.List;

public class ValidateAddStudent implements Validator<AddStudent> {
    @Override
    public List<String> validate(AddStudent smth) {
        List<String> errors = new ArrayList<>();
        if (ValidateString.IsEmpty(smth.getFirstName())) {
            errors.add("Empty Firstname");
        }
        if (ValidateString.IsNull(smth.getFirstName())) {
            errors.add("Firstname address is null");
        }
        if (ValidateString.IsTooLong(smth.getFirstName())) {
            errors.add("Too long Firstname");
        }
        if (ValidateString.IsEmpty(smth.getLastName())) {
            errors.add("Empty Lastname");
        }
        if (ValidateString.IsNull(smth.getLastName())) {
            errors.add("Lastname address is null");
        }
        if (ValidateString.IsTooLong(smth.getLastName())) {
            errors.add("Too long Lastname");
        }
        if (ValidateString.IsEmpty(smth.getLastName())) {
            errors.add("Illegal Lastname");
        }
        if (ValidateString.IsEmpty(smth.getPatronymic())) {
            errors.add("Empty Middle name");
        }
        if (ValidateString.IsNull(smth.getPatronymic())) {
            errors.add("Middle name address is null");
        }
        if (ValidateString.IsTooLong(smth.getPatronymic())) {
            errors.add("Too long Middle name");
        }
        if (ValidateId.validate(smth.getGroupId())) {
            errors.add("Illegal Group ID");
        }
        return errors;
    }
}
