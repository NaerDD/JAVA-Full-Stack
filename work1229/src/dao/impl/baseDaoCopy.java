package dao.impl;

import java.sql.*;

public class baseDaoCopy {
    //4条String语句
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/testdb5";
    private static final String USER = "root";
    private static final String PWD = "123456";
    //3个核心接口
    Connection conn = null;
    PreparedStatement sta = null;
    ResultSet rs = null;
    //2个开关
    public void db_open(){
        try {
            conn = DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void db_close(){
        try {
            if (conn!= null){
                conn.close();
            }
            if (sta!= null){
                sta.close();
            }
            if (rs!= null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //一个注册驱动
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
