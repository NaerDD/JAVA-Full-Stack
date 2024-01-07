package ProductManager.dao.impl;

import ProductManager.bean.category;
import ProductManager.bean.product;
import ProductManager.dao.productDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class productDaoImp extends BaseDao implements productDao<product> {
    //添加商品功能
    @Override
    public int add(product p) {
        //添加一个结果显示
        int flag = 0;
        String sql = new String("insert into productinfo values(null,?,?,?,?,?,?,?)");
        try {
            //开启连接
            super.open_db();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql);
            //组装 给sql语句中的?赋值
            super.sta.setString(1,p.getProdName());
            super.sta.setDouble(2,p.getProPrice());
            super.sta.setString(3,p.getPublisher());
            //时间 要转换 //java.util.Date-->long-->java.sql.date
            super.sta.setDate(4,new java.sql.Date(p.getDate().getTime()));
            super.sta.setString(5,p.getProdColor());
            super.sta.setInt(6,p.getProdCount());
            super.sta.setInt(7,p.getCateId());
            //执行 拿到返回值
            flag=super.sta.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return flag;
    }

    //通用查询  提供添加时间范围，颜色，数量范围，类别名称，商品名称作为筛选条件查询商品，
    @Override
    public List<Object> generateQuery(Map<String, Object> pars) {
        //添加一个集合 用于维护sql参数 和参数值顺序一致
        List<Object> ps = new ArrayList<>();
        //增加一个结果集
        List<Object> resultSet = new ArrayList<>();
        //组建sql指令
        StringBuilder sql = new StringBuilder("select * from productinfo where 1=1");
        if(pars.containsKey("createTime")){
            sql.append(" and createTime = ?");
            ps.add(pars.get("createTime"));
        }
        if(pars.containsKey("prodColor")){
            sql.append(" and prodColor = ?");
            ps.add(pars.get("prodColor"));
        }
        if(pars.containsKey("prodCount")){
            sql.append(" and prodCount = ?");
            ps.add(pars.get("prodCount"));
        }
        if(pars.containsKey("cateId")){
            sql.append(" and cateId = ?");
            ps.add(pars.get("cateId"));
        }
        if(pars.containsKey("prodName")){
            sql.append(" and prodName = ?");
            ps.add(pars.get("prodName"));
        }
        sql.append(";");
        System.out.println(sql.toString());
        try {
            //建立连接
            super.open_db();
            //建立通讯对象
            super.sta = super.conn.prepareStatement(sql.toString());
            //遍历集合
            for (int i = 0; i < ps.size(); i++) {
                super.sta.setObject(i+1,ps.get(i));
            }
            //执行命令 得到结果集 并解析
            super.rs = super.sta.executeQuery();
            while (super.rs.next()){
                product p1 = new product();
                p1.setProdName(super.rs.getString(2));
                p1.setProPrice(super.rs.getFloat(3));
                p1.setPublisher(super.rs.getString(4));
                p1.setDate(super.rs.getDate(5));
                p1.setProdColor(super.rs.getString(6));
                p1.setProdCount(super.rs.getInt(7));
                p1.setCateId(super.rs.getInt(8));
                //组装好的对象存入集合中
                resultSet.add(p1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return resultSet;
    }

    //根据id单查询
    @Override
    public product soloQueryPro(Integer id) {
        product p2 = new product();
        String sql = new String("select * from productinfo where id=?");
        try {
            //建立连接
            super.open_db();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql);
            //组装 给sql语句中的?赋值
            super.sta.setObject(1,id);
            //执行 拿到返回值
            super.rs= super.sta.executeQuery();
            while (super.rs.next()){
                p2.setProdName(super.rs.getString(2));
                p2.setProPrice(super.rs.getFloat(3));
                p2.setPublisher(super.rs.getString(4));
                p2.setDate(super.rs.getDate(5));
                p2.setProdColor(super.rs.getString(6));
                p2.setProdCount(super.rs.getInt(7));
                p2.setCateId(super.rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return p2;
    }

    @Override
    public int remove(Object id) {
//        4. 商品修改功能，根据用户提供的商品编号，对商品的名称，单价，剩余数量，发布人姓名，颜色及商品类别进行修改(20分)
        return 0;
    }

    @Override
    public List query() {
        return null;
    }


    @Override
    public int modify(product product) {
        return 0;
    }
}
