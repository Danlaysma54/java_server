package service.group;

import Repo.Dummy.GroupRepoRealization;
import Repo.Dummy.StudentRepoRealization;
import entity.Group;
import requests.group.AddStudentGroup;
import requests.group.DeleteStudentGroup;
import requests.group.EditStudentGroup;
import requests.group.GetStudentGroupById;
import response.group.AddStudentGroupResponse;
import response.group.EditStudentGroupResponse;
import response.group.GetStudentGroupByIdResponse;

public class GroupService {
    private StudentRepoRealization studentRepoRealization;
    private GroupRepoRealization groupRepoRealization;

    public AddStudentGroupResponse addStudentGroupService(AddStudentGroup request) {
        return new AddStudentGroupResponse(groupRepoRealization.addNewGroup(new Group(request.getName(), 0)));
    }

    public void deleteStudentGroupService(DeleteStudentGroup request) {
        groupRepoRealization.deleteGroupById(request.getId());
    }

    public EditStudentGroupResponse editStudentGroupService(EditStudentGroup request) {
        groupRepoRealization.editGroup(new Group(request.getName(), request.getId()));
        return new EditStudentGroupResponse(request.getName(), request.getId());
    }

    public GetStudentGroupByIdResponse getStudentGroupByIdService(GetStudentGroupById request) {
        return new GetStudentGroupByIdResponse(groupRepoRealization.getGroupById(request.getId()).getGroupName(), groupRepoRealization.getGroupById(request.getId()).getId());
    }
}
