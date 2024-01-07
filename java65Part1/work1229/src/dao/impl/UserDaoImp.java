package dao.impl;

import bean.User;
import dao.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImp extends BaseDao implements UserDao<User> {

    //注册
    @Override
    public int add(User user) {
        String sql = new String("insert into userInfo values(null,?,?,?)");
        //受影响的行数
        int flag = 0;
        try {
            //开启通讯
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql);
            super.sta.setString(1,user.getU_name());
            super.sta.setString(2,user.getLoginId());
            super.sta.setString(3,user.getLoginPwd());
            flag = super.sta.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close_db();
        }
        return flag;
    }

    @Override
    public int remove(User user) {
        return 0;
    }
    @Override
    public int modify(User user) {
        return 0;
    }
    @Override
    public List<User> query(User user) {
        return null;
    }

    @Override
    public Integer login(String str1,String str2) {
        List<Object> list = new ArrayList<>();
        String sql = new String("select * from userInfo where loginId = ? and loginPwd = ?");
        int flag = 0;
        try {
            //开启通讯
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql);
            super.sta.setString(1,str1);
            super.sta.setString(2,str2);
            super.rs=super.sta.executeQuery();
            if(super.rs.next()){
                flag = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close_db();
        }
        return flag;
    }
}
