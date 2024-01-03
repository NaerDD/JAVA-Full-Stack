package exam.dao.impl;

import java.sql.*;

public class BaseDao {
    //4个String
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/part1";
    private static final String USER = "root";
    private static final String PWD = "123456";
    //3个
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement sta = null;
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
            if(conn!=null){
                conn.close();
            }
            if(rs!=null){
                rs.close();
            }
            if(sta!=null){
                sta.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //一个静态代码块
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
