package dao;

import bean.User;

import java.util.List;

public interface UserDao<T> extends totalDao<T>{
    Integer login(String str1,String str2);
}
