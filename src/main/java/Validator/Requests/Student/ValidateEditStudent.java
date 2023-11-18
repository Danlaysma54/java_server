package Validator.Requests.Student;

import Validator.Requests.Validator;
import requests.students.EditStudent;
import Validator.ValidateString;
import Validator.ValidateId;
import Validator.ValidateStatus;

import java.util.ArrayList;
import java.util.List;

public class ValidateEditStudent implements Validator<EditStudent> {
    @Override
    public List<String> validate(EditStudent smth) {
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
        if (ValidateString.IsEmpty(smth.getMiddleName())) {
            errors.add("Empty Middle name");
        }
        if (ValidateString.IsNull(smth.getMiddleName())) {
            errors.add("Middle name address is null");
        }
        if (ValidateString.IsTooLong(smth.getMiddleName())) {
            errors.add("Too long Middle name");
        }
        if (ValidateId.validate(smth.getGroupId())) {
            errors.add("Illegal Group ID");
        }
        if (ValidateId.validate(smth.getId())) {
            errors.add("Illegal ID");
        }
        if (ValidateStatus.validate(smth.getStatus())) {
            errors.add("Illegal status");
        }
        return errors;
    }
}
