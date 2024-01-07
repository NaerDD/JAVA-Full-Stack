package dao;

import bean.book;
import dao.impl.BaseDao;

import java.util.List;
import java.util.Map;

public interface BookDao<T> extends CurrentDao<T> {
    List<book> queryAll();
    List<Object> generateQuery(Map<String,Object> pars);
}
