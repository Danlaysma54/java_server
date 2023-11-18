package response.student;

import entity.Student;

public class AddStudentResponse {
    private long id;

    public AddStudentResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "id=" + id;
    }
}
