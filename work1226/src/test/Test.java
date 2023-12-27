package test;

import bean.Department;
import dao.DepartmentDao;
import dao.DepartmentDao2;
import dao.impl.DepartmentDaoImpl;
import dao.impl.DepartmentDaoImpl2;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Department d1=new Department(100,"商务部","南岸");
        DepartmentDao<bean.Department> ddao=new DepartmentDaoImpl();

//        System.out.println(ddao.add(d1)==0?"新增失败!":"新增功能");

//        List<Department> departments = ddao.query();
//        for (Department d2 : departments) {
//            System.out.println(d2);
//        }

        //条件查询
//        List<Department> d3 = ddao.query(10);
//        System.out.println(d3);

        //条件删除
//        int d4 = ddao.remove(100);
//        System.out.println("删除了"+d4+"行");

        //修改
//        Department d1 = new Department(40,"nnn","aaa");
//        int num = ddao.modify(d1);
//        System.out.println("修改了"+num+"行");

        //通用查询
        HashMap<String,Object> pars = new HashMap<>();
        DepartmentDao2<Department> ddao2=new DepartmentDaoImpl2();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的部门编号:(*代表不输入)");
        String id= sc.next();
        if(!id.equals("*")){
            //用户输入的编号信息
            pars.put("deptId",id);
        }
        System.out.println("请输入要查找的部门名称:(*代表不输入)");
        String name= sc.next();
        if(!id.equals("*")){
            //用户输入的编号信息
            pars.put("deptName",name);
        }
        System.out.println("请输入要查找的部门地址:(*代表不输入)");
        String address= sc.next();
        if(!id.equals("*")){
            //用户输入的编号信息
            pars.put("deptAddress",address);
        }
        ddao2.generateQuery(pars);


    }
}
