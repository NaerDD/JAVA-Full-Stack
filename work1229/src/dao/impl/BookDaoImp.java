package dao.impl;

import bean.BookInfo;
import dao.BookDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookDaoImp extends BaseDao implements BookDao<Object> {


    @Override
    public List<BookInfo> queryByInfo(HashMap<String, Object> pars) {
        StringBuilder sql = new StringBuilder("select * from bookinfo inner join " +
                "typeinfo on bookinfo.b_t_id=typeinfo.t_id" +
                " where 1=1");
        //准备一个有序的集合 用于存储参数的对应值 维持顺序的一致性
        List<Object> ps=new ArrayList<>();
        //结果集
        List<BookInfo> results=new ArrayList<>();
        if (pars.containsKey("b_name")){
            sql.append(" and b_name=? ");
            ps.add(pars.get("b_name"));
        }
        if (pars.containsKey("auther_name")){
            sql.append(" and auther_name=? ");
            ps.add(pars.get("auther_name"));
        }
        if (pars.containsKey("b_t_id")){
            sql.append(" and b_t_id=? ");
            ps.add(pars.get("b_t_id"));
        }
        try {
            //开启
            super.open_db();
            super.sta = super.conn.prepareStatement(sql.toString());
            //为sql命令中的参数供值
            for (int i = 0; i < ps.size(); i++) {
                //将ps集合中的添加了条件的顺序设置到? 从而赋值
                super.sta.setObject(i+1,ps.get(i));
            }
            System.out.println(sql);
            super.rs = super.sta.executeQuery();
            //将结果集遍历出来放到 results结果集中
            while (super.rs.next()){
                BookInfo book = new BookInfo();
                book.setB_id(super.rs.getInt(1));
                book.setB_name(super.rs.getString(2));
                book.setAuthor_name(super.rs.getString(3));
                book.setB_t_id(super.rs.getInt(4));
                book.setB_des(super.rs.getString(5));
                book.getType().setT_id(super.rs.getInt(6));
                book.getType().setT_name(super.rs.getString(7));
                book.getType().setT_parentId(super.rs.getInt(8));
                book.getType().setT_des(super.rs.getString(9));
                results.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return results;
    }


    @Override
    public int add(Object o) {
        return 0;
    }

    @Override
    public int remove(Object o) {
        return 0;
    }

    @Override
    public int modify(Object o) {
        return 0;
    }

    @Override
    public List<Object> query(Object o) {
        return null;
    }
}
