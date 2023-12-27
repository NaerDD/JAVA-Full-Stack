package dao;


import java.util.List;

public interface CurrentDao<T> {
    int add(T t);
    int modify(T t);
    int remove(Object id);
    List<T> query();
}
