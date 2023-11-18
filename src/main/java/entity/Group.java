package entity;

public class Group {
    private String groupName;
    private long id;

    public Group(String groupName,long id) {
        this.groupName = groupName;
        this.id=id;
    }
    public String getGroupName() {
        return groupName;
    }

    public boolean equals(String groupName) {
        return this.groupName.equals(groupName);
    }

    @Override
    public int hashCode() {
        return this.groupName.hashCode();
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return groupName;
    }
}
