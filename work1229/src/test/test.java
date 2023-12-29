package test;

import bean.BookInfo;
import bean.User;
import dao.impl.BookDaoImp;
import dao.impl.UserDaoImp;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        UserDaoImp userDaoImp = new UserDaoImp();
        BookDaoImp bookDaoImp = new BookDaoImp();
        System.out.println("欢迎来到图书管理系统:1.账号注册 2.账号登录 3.退出");
        int num = sc.nextInt();
        switch (num){
            case 1:
                //注册
                User user = new User();
                System.out.println("输入要注册的账号昵称");
                user.setU_name(sc.next());
                System.out.println("输入要注册的账号");
                user.setLoginId(sc.next());
                System.out.println("输入要注册的密码");
                user.setLoginPwd(sc.next());
                System.out.println(userDaoImp.add(user) == 0 ? "失败" : "成功");
                menu();
                break;
            case 2:
                //登陆
                System.out.println("输入登陆的账号:");
                String str1 = sc.next();
                System.out.println("输入登陆的密码:");
                String str2 = sc.next();
                int flag = userDaoImp.login(str1,str2);
                if(flag==1){
                    System.out.println("登陆成功");
                    HashMap<String,Object> pars = new HashMap<>();
                    //调用查询
                    System.out.println("输入你要查询的书名:(*代表无)");
                    String name = sc.next();
                    if(!name.equals("*")){
                        pars.put("b_name",name);
                    }
                    System.out.println("输入你要查询的作者:(*代表无)");
                    String author = sc.next();
                    if(!author.equals("*")){
                        pars.put("auther_name",author);
                    }

                    System.out.println("输入你要查询的书类别:(*代表无)");
                    String t_id = sc.next();
                    if(!t_id.equals("*")){
                        pars.put("t_id",t_id);
                    }
                    List<BookInfo> list = bookDaoImp.queryByInfo(pars);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i).getB_name()+"\t");
                        System.out.print(list.get(i).getAuthor_name()+"\t");
                        System.out.print(list.get(i).getB_des()+"\t");
                        System.out.print(list.get(i).getType().getT_name()+"\n");
                    }
                }else{
                    System.out.println("账号或密码错误");
                }
                menu();
                break;
            case 3:
                System.out.println("欢迎下次使用");
                break;
        }

    }
}
