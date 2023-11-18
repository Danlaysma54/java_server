package Repo;

import entity.Group;

import java.util.List;

public interface GroupRepo {
    public void deleteGroupById(long id);
    public void editGroup(Group group);
    public long addNewGroup(Group group); //на входе сущность с id = null, сущность добавляется в хранилище, при этом ей назначается значение id, этот id возвращается как результат
    public Group getGroupById(long id);
    public List<Group> getAllGroups();
}
