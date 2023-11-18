package Validator;

public class ValidateString {
    public static boolean IsTooLong(String smth) {
        return smth.length() <= 50;
    }

    public static boolean IsNull(String smth) {
        return smth == null;
    }

    public static boolean IsEmpty(String smth) {
        return smth.equals("");
    }
}
