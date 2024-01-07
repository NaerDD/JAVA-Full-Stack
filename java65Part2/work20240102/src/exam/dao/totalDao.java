package exam.dao;

import java.util.List;

public interface totalDao<T> {
    int add(T t);
    int remove(T t);
    int modify(T t);
    List<T> query(T t);
}
