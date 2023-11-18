package Validator.Requests;

import java.util.List;

public interface  Validator<T>  {
    List<String> validate(T smth);
}
