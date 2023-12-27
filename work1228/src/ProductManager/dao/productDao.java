package ProductManager.dao;

import ProductManager.bean.product;

public interface productDao<T> extends totalDao<T>{
    int add(product p);
}
