package exam.dao;

import exam.bean.User;

import java.util.List;

public interface ManagerDao<T> extends totalDao<T>{
    List<User> queryAll();
}
