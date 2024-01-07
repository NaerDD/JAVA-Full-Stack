package dao;

import java.util.List;

public interface UserDao<T> extends CurrentDao<T> {
        List<Object> login(String str1,String str2);
}
