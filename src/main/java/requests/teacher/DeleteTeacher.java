package requests.teacher;

public class DeleteTeacher {
    private final long id;

    public long getId() {
        return id;
    }

    public DeleteTeacher(long id) {
        this.id = id;
    }
}
