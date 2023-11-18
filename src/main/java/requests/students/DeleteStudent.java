package requests.students;

public class DeleteStudent {
    private final long id;

    public long getId() {
        return id;
    }

    public DeleteStudent(long id) {
        this.id = id;
    }
}
