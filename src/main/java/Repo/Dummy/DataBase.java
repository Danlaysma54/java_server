package Repo.Dummy;

import entity.Group;
import entity.Student;
import entity.StudentDB;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<Long, Group> groupMap;
    private Map<Long, StudentDB> studentMap;

    DataBase() {
        this.groupMap = new HashMap<>();
        this.studentMap = new HashMap<>();
    }

    public Map<Long, Group> getGroupMap() {
        return groupMap;
    }

    public Map<Long, StudentDB> getStudentMap() {
        return studentMap;
    }

}
