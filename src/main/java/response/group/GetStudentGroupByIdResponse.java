package response.group;

import entity.Student;
import requests.group.GetStudentGroupById;

public class GetStudentGroupByIdResponse {
    private String groupName;
    private long group_id;

    public GetStudentGroupByIdResponse(String groupName, long group_id) {
        this.groupName = groupName;
        this.group_id = group_id;
    }


    public String getGroupName() {
        return groupName;
    }


    public long getGroup_id() {
        return group_id;
    }

    @Override
    public String toString() {
        return "GetStudentGroupByIdResponse{" +
                "groupName='" + groupName + '\'' +
                ", group_id=" + group_id +
                '}';
    }
}
