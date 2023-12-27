package ProductManager.dao.impl;

import ProductManager.bean.product;
import ProductManager.dao.productDao;
import ProductManager.dao.totalDao;

import java.util.List;

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
            //时间 要转换
            super.sta.setDate(4,p.getDate());
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

    @Override
    public int remove(Object id) {
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
