package ProductManager.dao;

import ProductManager.bean.product;

import java.util.List;
import java.util.Map;

public interface productDao<T> extends totalDao<T>{
    int add(product p);
    List<Object> generateQuery(Map<String,Object> pars);
    product soloQueryPro(Integer id);
}
