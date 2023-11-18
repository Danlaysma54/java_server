package requests.group;

public class EditStudentGroup {
    private final long id;
    private final String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EditStudentGroup(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
