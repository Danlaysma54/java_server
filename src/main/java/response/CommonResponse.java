package response;

import java.util.List;

public class CommonResponse<T> {
    private T data;
    private int errorCode;
    private String errorMessage;
    private List<String> errors;
    private boolean flag;

    public CommonResponse(T data) {
        this.data = data;
        this.errorCode = 200;
        this.errorMessage = null;
        this.errors = null;
        this.flag = true;
    }

    public CommonResponse(String errorMessage, int errorCode, List<String> list) {
        this.data = null;
        this.errorCode = errorCode;
        this.errorMessage = null;
        this.errors = list;
        this.flag = false;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
