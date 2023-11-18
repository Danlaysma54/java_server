package Validator;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class ValidateDate {
    public boolean validate(String smth){
       try {
          return LocalDate.parse(smth).isBefore(LocalDate.now());
       }catch (DateTimeParseException err){
           return false;
       }
    }
}
