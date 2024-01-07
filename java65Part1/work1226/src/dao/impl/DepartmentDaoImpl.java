package dao.impl;

import bean.Department;
import dao.DepartmentDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DepartmentDaoImpl extends BaseDao implements DepartmentDao<Department> {
    //添加
    @Override
    public int add(Department department) {
        //组建SQL指令
        StringBuilder sql=new StringBuilder("insert into department values(");
        sql.append(department.getDeptId()).append(",'");
        sql.append(department.getDeptName()).append("','");
        sql.append(department.getDeptAddress()).append("'");
        sql.append(");");
        int count=0;//受影响的行数
        try {
            //开启了连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.createStatement();
            count=super.sta.executeUpdate(sql.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }

        return count;
    }

    //修改
    @Override
    public int modify(Department department) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入修改后的id");
        Integer num = sc.nextInt();
        System.out.println("输入修改后的部门名称");
        String name = sc.next();
        System.out.println("输入修改后的部门地址");
        String address = sc.next();
        //组建SQL指令
        StringBuilder sql=new StringBuilder("UPDATE department set DeptId = ");
        sql.append(num).append(",");
        sql.append("deptName=");
        sql.append("\"");
        sql.append(name).append("\",");
        sql.append("deptAddress=");
        sql.append("\"");
        sql.append(address).append("\" WHERE deptID = ");
        sql.append(department.getDeptId());
        int count=0;//受影响的行数
        try {
            //开启了连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.createStatement();
            count=super.sta.executeUpdate(sql.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }
        return count;
    }

    //条件删除
    @Override
    public int remove(Object id) {
        List<Department> list = query((Integer) id);
        int count=0;//受影响的行数
        if(list==null){
            //没找到
            System.out.println("没有找到要删除的对象!");
        }else{
            for (int i = 0; i < list.size(); i++) {
                Integer Id = list.get(i).getDeptId();
                //组建SQL指令
                StringBuilder sql=new StringBuilder("delete from department where deptId=");
                sql.append(Id).append(";");
                try {
                    //建立连接
                    super.open_db();
                    //创建通讯对象
                    super.sta=super.conn.createStatement();
                    //创建通讯对象
                    super.sta=super.conn.createStatement();
                    count+=super.sta.executeUpdate(sql.toString());
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    //回收所有开启过的对象
                    super.close_db();
                }

            }

        }
        return count;
    }

    //全查询
    @Override
    public List<Department> query() {
        //组建SQL指令
        String sql=new String("select * from department;");
        List<Department> list = new ArrayList<>();
        try {
            //建立连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.createStatement();
            //执行查询语句 接收返回的结果集对象
            super.rs = super.sta.executeQuery(sql);
            //对结果集进行解析
            while (super.rs.next()){
                //创建一个新的部门对象 用其属性存储这一行的列数据
                Department dept = new Department();
                //rs 代表当前取出的这一行
                dept.setDeptId(super.rs.getInt("deptId"));
                dept.setDeptName(super.rs.getString("deptName"));
                dept.setDeptAddress(super.rs.getString("deptAddress"));
                //将组装好的数据对象 存储到集合中去
                list.add(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }
        return list;
    }

    //条件查询 根据id查询
    @Override
    public List<Department> query(Integer deptId) {
        List<Department> list = new ArrayList<>();
        //组建SQL指令
        StringBuilder sql=new StringBuilder("select * from department where deptId=");
        sql.append(deptId).append(";");
        try {
            //建立连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.createStatement();
            //执行查询语句 接收返回的结果集对象
            super.rs = super.sta.executeQuery(sql.toString());
            //对结果集进行解析
            while (super.rs.next()){
                //创建一个新的部门对象 用其属性存储这一行的列数据
                Department dept = new Department();
                //rs 代表当前取出的这一行
                dept.setDeptId(super.rs.getInt("deptId"));
                dept.setDeptName(super.rs.getString("deptName"));
                dept.setDeptAddress(super.rs.getString("deptAddress"));
                //将组装好的数据对象 存储到集合中去
                list.add(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }
        return list;
    }
}
