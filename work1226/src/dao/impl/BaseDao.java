package dao.impl;

import java.sql.*;

public class BaseDao {
    //从多个数据访问类中 提取出来的公共成员
    //4个字符串
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/testdb2";
    private static final String USER="root";
    private static final String PWD="123456";
    //3个核心接口对象  连接对象  通讯对象 结果集对象(只服务于查询)
    protected Connection conn=null;
    protected Statement sta=null;
    protected ResultSet rs=null;
    //1个静态代码块 用于注册驱动
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //2个方法 一个负责开启连接 一个负责关闭连接并回收所有创建过的对象
    public void open_db(){
        try {
            //开启连接 并将连接对象存储到conn变量中
            conn=DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close_db(){
        try {
            //回收结果集对象
            if (rs!=null) {
                rs.close();
            }
            //销毁通讯对象
            if (sta!=null){
                sta.close();
            }
            if (conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
