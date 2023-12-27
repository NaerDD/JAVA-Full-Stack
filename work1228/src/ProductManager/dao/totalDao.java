package ProductManager.dao;

import java.util.List;

public interface totalDao<T> {
    int add(T t);
    int modify(T t);
    int remove(Object id);
    List<T> query();
}
