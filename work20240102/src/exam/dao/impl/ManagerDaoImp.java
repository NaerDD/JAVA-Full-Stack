package exam.dao.impl;

import exam.bean.User;
import exam.dao.ManagerDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerDaoImp extends BaseDao implements ManagerDao<User> {

    @Override
    public List<User> queryAll() {
        String sql = new String("select * from userInfo");
        //增加一个结果集合
        List<User> ps = new ArrayList<>();
        try {
            //开启连接
            super.db_open();
            //创建通讯对象
            super.sta = super.conn.prepareStatement(sql);
            //执行命令 得到结果集
            super.rs = super.sta.executeQuery();
            //对结果进行解析
            while (super.rs.next()){
                User user = new User();
                user.setUserId(super.rs.getInt(1));
                user.setLoginName(super.rs.getString(2));
                user.setLoginPwd(super.rs.getString(3));
                user.setEmail(super.rs.getString(4));
                user.setRoleId(super.rs.getInt(5));
                user.setState(super.rs.getInt(6));
                user.setLast_logintime(super.rs.getDate(7));
                //将组装好的对象 存入集合中
                ps.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.db_close();
        }
        return ps;
    }


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
        Scanner sc = new Scanner(System.in);
        System.out.println("输入修改后的用户id:");
        int num = sc.nextInt();
        System.out.println("输入修改后的用户名:");
        String name = sc.next();
        System.out.println("输入修改后的用户密码:");
        String pwd = sc.next();
        System.out.println("输入修改后的邮箱:");
        String email = sc.next();
        System.out.println("输入修改后的用户角色:");
        int roleid = sc.nextInt();
        System.out.println("输入修改后的用户状态:");
        int state = sc.nextInt();
        StringBuilder sql = new StringBuilder("UPDATE userInfo set userId = ");
        sql.append(num).append(",");
        sql.append("loginName=");
        sql.append("\"");
        sql.append(name).append("\",");
        sql.append("loginPwd=");
        sql.append("\"");
        sql.append(pwd).append("\",");
        sql.append("email=");
        sql.append("\"");
        sql.append(email).append("\",");
        sql.append("roleid=");
        sql.append("\"");
        sql.append(roleid).append("\",");
        sql.append("state=");
        sql.append("\"");
        sql.append(state).append("\" where userId = ");
        sql.append(user.getUserId());
        int count = 0;
        try {
            //开启连接
            super.db_open();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql.toString());
            count=super.sta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            super.db_close();
        }
        return count;
    }

    @Override
    public List<User> query(User user) {
        return null;
    }


}
