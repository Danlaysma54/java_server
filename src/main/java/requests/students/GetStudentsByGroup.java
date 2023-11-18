package requests.students;

public class GetStudentsByGroup {
    private final long groupId;

    public GetStudentsByGroup(long id) {
        this.groupId = id;
    }

    public long getGroupId() {
        return groupId;
    }
}
