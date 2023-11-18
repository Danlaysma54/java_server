package response;

public class ResponseEntity<T> {
    private String answer;
    private long status;

    public ResponseEntity(String answer, long status) {
        this.answer = answer;
        this.status = status;
    }

    public String getAnswer() {
        return answer;
    }

    public long getStatus() {
        return status;
    }
}
