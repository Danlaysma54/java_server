package Validator;

public class ValidateStatus {
    public static boolean validate(String str){
        return !(str.equals("STUDY") || str.equals("VACATION") || str.equals("DISMISSED"));
    }
}
