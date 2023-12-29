package dao;

import bean.BookInfo;
import dao.impl.BaseDao;

import java.util.HashMap;
import java.util.List;

public interface BookDao<T> extends totalDao<T> {
    List<BookInfo> queryByInfo(HashMap<String,Object> pars);
}
