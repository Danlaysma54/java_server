package requests.teacher;

public class GetTeacherById {
    private final long id;

    public long getId() {
        return id;
    }

    public GetTeacherById(long id) {
        this.id = id;
    }
}
