package response.group;

import entity.Student;

public class EditStudentGroupResponse {
    private String groupName;
    private long group_id;

    public EditStudentGroupResponse(String groupName, long group_id) {
        this.group_id = group_id;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }


    public long getGroup_id() {
        return group_id;
    }

    @Override
    public String toString() {
        return "groupName='" + groupName + '\'' +
                ", group_id=" + group_id +
                '}';
    }
}
