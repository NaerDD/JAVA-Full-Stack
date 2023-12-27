package dao.impl;

import bean.book;
import dao.BookDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookDaoImpl extends BaseDao implements BookDao<book> {
    Scanner sc = new Scanner(System.in);
    @Override
    public List<book> queryAll() {
        //增加一个结果集合
        List<book> ps = new ArrayList<>();
        //组建SQL指令
        String sql = new String("select * from bookinfo;");
        try {
            //开启了链接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql);
            //执行命令 得到结果集
            super.rs = super.sta.executeQuery();
            //对结果进行解析
            while (super.rs.next()) {
                book book = new book();
                book.setB_name(super.rs.getString(2));
                book.setAuthor_name(super.rs.getString(3));
                book.setB_des(super.rs.getString(5));
                book.setB_t_id(super.rs.getInt(4));
                //组装好的对象存入集合中
                ps.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return ps;
        }

    //通用查询 书籍类  --书名 类别ID 描述
    @Override
    public List<Object> generateQuery(Map<String, Object> pars) {
        //增加一个集合 该集合用于维持sql参数 和 参数值顺序的一致
        List<Object> ps=new ArrayList<>();
        //添加一个结果集
        List<Object> resultSet = new ArrayList<>();
        //组建sql命令 where 1=1 消耗了 where子句关键字 后续条件均可使用and拼接
        StringBuilder sql = new StringBuilder("select * from bookinfo where 1=1 ");
        if(pars.containsKey("b_name")){
            sql.append(" and b_name = ?");
            ps.add(pars.get("b_name"));
        }
        if(pars.containsKey("auther_name")){
            sql.append(" and auther_name = ?");
            ps.add(pars.get("auther_name"));
        }
        if(pars.containsKey("b_t_id")){
            sql.append(" and b_t_id= ?");
            ps.add(pars.get("b_t_id"));
        }
        sql.append(";");
        System.out.println(sql.toString());
        try {
            //建立连接
            super.open_db();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql.toString());
            //遍历集合
            for (int i = 0; i < ps.size(); i++) {
                //不同的参数 类型不同 难以判定使用哪一个特定类型的set方法
                super.sta.setObject(i+1,ps.get(i));
            }
            //执行命令 得到结果集 并解析
            super.rs = super.sta.executeQuery();
            while(super.rs.next()){
                book book = new book();
                book.setB_name(super.rs.getString(2));
                book.setAuthor_name(super.rs.getString(3));
                book.setB_des(super.rs.getString(5));
                book.setB_t_id(super.rs.getInt(4));
                //组装好的对象存入集合中
                resultSet.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return resultSet;
    }

    @Override
    public int add(book book) {
        return 0;
    }

    @Override
    public int modify(book book) {
        return 0;
    }

    @Override
    public int remove(Object id) {
        return 0;
    }

    @Override
    public List<book> query() {
        return null;
    }
};


