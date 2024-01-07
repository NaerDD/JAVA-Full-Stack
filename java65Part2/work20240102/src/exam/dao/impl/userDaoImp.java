package exam.dao.impl;

import exam.bean.User;
import exam.dao.userDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class userDaoImp extends BaseDao implements userDao<User> {

    @Override
    public int add(User user) {
        return 0;
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
    public User login(String str1, String str2) {
        String sql = "select * from UserInfo where loginName = ? and loginPwd = ?";
//        List<User> results=new ArrayList<>();
        User user = null;
        try {
            //开启通讯
            super.db_open();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql);
            super.sta.setString(1, str1);
            super.sta.setString(2, str2);
            super.rs = super.sta.executeQuery();
            user = new User();
            while (super.rs.next()) {
                user.setUserId(super.rs.getInt(1));
                user.setLoginName(super.rs.getString(2));
                user.setLoginPwd(super.rs.getString(3));
                user.setEmail(super.rs.getString(4));
                user.setRoleId(super.rs.getInt(5));
                user.setState(super.rs.getInt(6));
                user.setLast_logintime(super.rs.getDate(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db_close();
        }
        return user;
    }

    @Override
    public int updateTime(User user) {
        String sql = new String("update UserInfo set last_logintime = ? where userId = ?");
        //结果
        int flag = 0;
        try {
            super.db_open();
            super.sta = super.conn.prepareStatement(sql);
            Date date = new Date();
            super.sta.setDate(1,new java.sql.Date(date.getTime()));
            super.sta.setInt(2,user.getUserId());
            flag = super.sta.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.db_close();
        }
        return flag;
    }
}
