package ProductManager.dao;

import ProductManager.bean.category;

import java.util.List;

public interface categoryDao<T> extends totalDao<T>{
    List<category> queryAll();
}
