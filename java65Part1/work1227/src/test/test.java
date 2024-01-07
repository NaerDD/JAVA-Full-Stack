package test;

import bean.book;
import bean.user;
import dao.impl.BookDaoImpl;
import dao.impl.UserDaoImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到图书管理系统:1.用户注册 2.用户登录 3.退出");
        //实例化 实现类
        UserDaoImpl userDao = new UserDaoImpl();
        //实例化 图书类
        BookDaoImpl bookDao = new BookDaoImpl();
        int num = sc.nextInt();
        switch (num){
            case 1:
                //注册功能
                System.out.println("请输入昵称:");
                String name = sc.next();
                System.out.println("请输入账号:");
                String account = sc.next();
                System.out.println("请输入密码:");
                String pwd = sc.next();
                //将接收到的数据封装成对象
                user u1 = new user(name,account,pwd);
                //返回结果打印
                System.out.println("添加了"+userDao.add(u1)+"行");
                menu();
                break;
            case 2:
                //登录功能
                System.out.println("请输入账号:");
                String account1 = sc.next();
                System.out.println("请输入密码:");
                String pwd1 = sc.next();
                List<Object> list = userDao.login(account1,pwd1);
                if(list.size()==0){
                    //账号或密码错误
                    System.out.println("账号密码错误");
                }else{
                    //登陆成功
                    System.out.println("登陆成功");
                    //调用图书全查
                    List<book> ps = bookDao.queryAll();
                    for (book p : ps) {
                        System.out.println(p);
                    }
                }
                System.out.println("欢迎登陆图书管理系统:1.查询图书 2.退出");
                int num2= sc.nextInt();
                switch (num2){
                    case 1:
                        //通用查询 前置条件提供
                        HashMap<String,Object> pars = new HashMap<>();
                        BookDaoImpl book2 = new BookDaoImpl();
                        System.out.println("请输入要查找的图书名:(*代表不输入)");
                        String name2= sc.next();
                        if(!name2.equals("*")){
                            //用户输入的编号信息
                            pars.put("b_name",name2);
                        }

                        System.out.println("请输入要查找的作者名:(*代表不输入)");
                        String name3= sc.next();
                        if(!name3.equals("*")){
                            //用户输入的编号信息
                            pars.put("auther_name",name3);
                        }

                        System.out.println("请输入要查找的书描述:(*代表不输入)");
                        String name4= sc.next();
                        if(!name4.equals("*")){
                            //用户输入的编号信息
                            pars.put("b_t_id",name4);
                        }

                        List<Object> obj = bookDao.generateQuery(pars);
                        for (Object o : obj) {
                            System.out.println(o);
                        }
                    case 2:
                        System.out.println("退出");
                        break;
                }
                menu();
                break;
            case 3:
                System.out.println("欢迎下次使用");
                break;
        }
    }
}
