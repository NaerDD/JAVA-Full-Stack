package ProductManager.dao.impl;

import ProductManager.bean.category;
import ProductManager.dao.categoryDao;
import ProductManager.dao.totalDao;

import java.util.ArrayList;
import java.util.List;

public class categoryDaoImp extends BaseDao implements categoryDao<category> {
    //添加类别
    @Override
    public int add(category c) {
        //组建SQL指令
        String sql = new String("insert into category values(null,?,?)");
        //受影响的行数
        int flag = 0;
        try {
            //开启了通讯
            super.open_db();
            //创建通讯对象 先将sql语句提交
            super.sta = super.conn.prepareStatement(sql);
            //组装 给sql语句中的?赋值
            super.sta.setString(1,c.getTitle());
            super.sta.setInt(2,c.getParentId());
            //执行 拿到返回值
            flag=super.sta.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return flag;
    }

    @Override
    public int modify(category category) {
        return 0;
    }

    @Override
    public int remove(Object id) {
        return 0;
    }

    @Override
    public List query() {
        return null;
    }

    //查找所有二级类别
    public List<category> querySec(){
    //增加一个结果集合
        List<category> ps = new ArrayList<>();
        //组建sql指令
        String sql = new String("select * from category where parentid is not null");
        try {
            //开启连接
            super.open_db();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql);
            //执行命令 得到结果集
            super.rs = super.sta.executeQuery();
            //对结果进行解析
            while (super.rs.next()){
                category category = new category();
                category.setId(super.rs.getInt(1));
                category.setTitle(super.rs.getString(2));
                category.setParentId(super.rs.getInt(3));
                //将组装好的对象 存入集合中
                ps.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return ps;
    }

    //全查询
    @Override
    public List<category> queryAll() {
        //增加一个结果集合
        List<category> ps = new ArrayList<>();
        //组建sql指令
        String sql = new String("select * from category");
        try {
            //开启连接
            super.open_db();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql);
            //执行命令 得到结果集
            super.rs = super.sta.executeQuery();
            //对结果进行解析
            while (super.rs.next()){
                category category = new category();
                category.setId(super.rs.getInt(1));
                category.setTitle(super.rs.getString(2));
                category.setParentId(super.rs.getInt(3));
                //将组装好的对象 存入集合中
                ps.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.close_db();
        }
        return ps;
    }
}
