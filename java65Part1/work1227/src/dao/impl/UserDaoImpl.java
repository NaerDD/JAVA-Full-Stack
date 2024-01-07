package dao.impl;
import bean.user;
import dao.UserDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao<user> {

    //注册 添加 返回受影响的行数
    @Override
    public int add(user u) {
        //组建SQL指令
        String sql=new String("insert into userinfo values(null,?,?,?);");
        int count=0;//受影响的行数
        try {
            //开启了连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql);
            super.sta.setString(1,u.getU_name());
            super.sta.setString(2,u.getLoginId());
            super.sta.setString(3,u.getLoginPwd());
            count=super.sta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }
        return count;
    }

    @Override
    public int modify(user user) {
        return 0;
    }

    @Override
    public int remove(Object id) {
        return 0;
    }

    @Override
    public List<user> query() {
        return null;
    }

    //登陆
    @Override
    public List<Object> login(String str1, String str2) {
        //增加一个集合 该集合用于维持sql参数 和 参数值顺序的一致
        List<Object> ps=new ArrayList<>();
        StringBuilder sql = new StringBuilder("select * from userInfo where 1=1 and loginId = ? and loginPwd = ?;");
        try {
            //开启了连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql.toString());
            super.sta.setString(1,str1);
            super.sta.setString(2,str2);
            super.rs=super.sta.executeQuery();
            while (super.rs.next()) {
                user u6 = new user();
                u6.setLoginId(super.rs.getString(1));
                u6.setU_name(super.rs.getString(2));
                u6.setLoginPwd(super.rs.getString(3));
                ps.add(u6);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }
        return ps;
    }




}
