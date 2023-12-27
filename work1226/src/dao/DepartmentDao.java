package dao;

import java.util.List;
import java.util.Map;

public interface DepartmentDao<T> extends CurrentDao<T> {
    List<T> query(Integer deptId);
}
