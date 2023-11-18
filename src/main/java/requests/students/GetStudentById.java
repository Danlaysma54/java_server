package requests.students;

public class GetStudentById {
    private final long id;

    public long getId() {
        return id;
    }

    public GetStudentById(long id) {
        this.id = id;
    }
}
