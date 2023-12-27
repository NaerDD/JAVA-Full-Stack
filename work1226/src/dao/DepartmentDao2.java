package dao;

import java.util.List;
import java.util.Map;

public interface DepartmentDao2<T> extends CurrentDao<T> {
    List<Object> generateQuery(Map<String,Object> pars);
}
