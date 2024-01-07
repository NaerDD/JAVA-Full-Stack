package dao.impl;

import bean.Department;
import dao.DepartmentDao2;

import java.sql.SQLException;
import java.util.*;

public class DepartmentDaoImpl2 extends BaseDao2 implements DepartmentDao2<Department> {


    @Override
    public int add(Department department) {
        return 0;
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
        String sql=new String("UPDATE department set DeptId = ?,deptName=?,deptAddress=? where deptID = ?");
        int count=0;//受影响的行数
        try {
            //开启了连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql);
            super.sta.setInt(1,num);
            super.sta.setString(2,name);
            super.sta.setString(3,address);
            super.sta.setInt(4,department.getDeptId());
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
    public int remove(Object id) {
        return 0;
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
            super.sta=super.conn.prepareStatement(sql);
            //执行查询语句 接收返回的结果集对象
            super.rs = super.sta.executeQuery();
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

    //通用查询
    @Override
    public List<Object> generateQuery(Map<String,Object> pars){
        //增加一个集合 该集合用于维持sql参数 和 参数值顺序的一致
        List<Object> ps=new ArrayList<>();
        //组建sql命令 where 1=1 消耗了 where子句关键字 后续条件均可使用and拼接
        StringBuilder sql = new StringBuilder("select * from department where 1=1");
        if(pars.containsKey("deptId")){
            sql.append(" and  deptId=?");
            ps.add(pars.get("deptId"));
        }
        if(pars.containsKey("deptName")){
            sql.append(" and  deptName like ?");
            ps.add("%"+pars.get("deptName")+"%");
        }
        if(pars.containsKey("deptAddress")){
            sql.append(" and  deptAddress like ?");
            ps.add(pars.get("deptAddress"));
        }
        sql.append(";");
        System.out.println(sql.toString());
        try {
            //建立连接
            super.open_db();
            //创建通讯对象
            super.sta=super.conn.prepareStatement(sql.toString());
            //遍历集合
            for (int i = 0; i < ps.size(); i++) {
                //不同的参数 类型不同 难以判定该使用哪一个特定类型的set方法
                super.sta.setObject(i+1,ps.get(i));
            }
            //执行命令 得到结果集 并对结果进行解析
            super.rs=super.sta.executeQuery();
            while (super.rs.next()){
                Department dept=new Department();
                dept.setDeptId(super.rs.getInt(1));//deptId
                dept.setDeptName(super.rs.getString(2));//deptName
                dept.setDeptAddress(super.rs.getString(3));//deptAddress
            //组装好的对象存入集合中
                ps.add(dept);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //回收所有开启过的对象
            super.close_db();
        }
        return ps;
}
}
