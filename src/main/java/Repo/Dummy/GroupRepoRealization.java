package Repo.Dummy;

import Repo.GroupRepo;
import entity.Group;
import entity.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupRepoRealization implements GroupRepo {
    DataBase db;

    GroupRepoRealization() {
    }

    @Override
    public Group getGroupById(long id) {
        return db.getGroupMap().get(id);
    }

    @Override
    public void deleteGroupById(long id) {
        db.getGroupMap().remove(id);
    }

    @Override
    public void editGroup(Group group) {
        db.getGroupMap().replace(group.getId(), group);
    }

    @Override
    public long addNewGroup(Group group) {
        long id = 0;
        if (!db.getGroupMap().isEmpty()) {
            id = Collections.max(db.getGroupMap().keySet()) + 1;
        }
        db.getGroupMap().put(id, new Group(group.getGroupName(), id));
        return id;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }
}
