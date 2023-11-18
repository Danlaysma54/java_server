package response.group;

import entity.Student;

public class AddStudentGroupResponse {
    private long groupId;

    public AddStudentGroupResponse(long groupId) {
        this.groupId = groupId;
    }


    public long getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return String.valueOf(groupId);
    }
}
