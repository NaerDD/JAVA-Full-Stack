package exam.dao;

import exam.bean.User;

public interface userDao<T> extends totalDao<T>{
    User login(String str1, String str2);
    int updateTime(User user);
}
