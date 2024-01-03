package exam.test;

import exam.bean.User;
import exam.dao.ManagerDao;
import exam.dao.impl.ManagerDaoImp;
import exam.dao.impl.userDaoImp;

import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        //实例化实现类
        userDaoImp user1 = new userDaoImp();
        ManagerDao m1 = new ManagerDaoImp();
        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎使用用户管理系统:1.登陆 2.退出");
        User user;
        int num = sc.nextInt();
        switch (num){
            case 1:
                //登陆功能
                System.out.println("输入账号:");
                String str1 = sc.next();
                System.out.println("输入密码:");
                String str2 = sc.next();
                user = user1.login(str1,str2);
                if(user==null){
                    System.out.println("用户名或者密码错误!");
                }else{
                    //判断账号的禁用状态
                    if(user.getState()==1){
                        //可以登陆
                        System.out.println("登陆成功!");
                        //更新最后一次登陆的时间
                        int flag = user1.updateTime(user);
                        if(flag ==1){
                            System.out.println("最后登录时间更新成功!");
                        }

                        while (true){
                            System.out.println("欢迎使用用户管理系统 您是管理员 可以使用以下功能:1.查询所有用户信息 2.更改用户信息 3.退出登陆");
                            int num2 = sc.nextInt();
                            switch (num2){
                                case 1:
                                    List<User> userList= m1.queryAll();
                                    userList.forEach(System.out::println);
                                    break;
                                case 2:
                                    int flag2 = 0;
                                    System.out.println("输入你要修改的用户id:");
                                    int userid = sc.nextInt();
                                    User user2 = new User();
                                    user2.setUserId(userid);
                                    flag2 = m1.modify(user2);
                                    if(flag2 == 1){
                                        System.out.println("修改成功!");
                                        break;
                                    }else{
                                        System.out.println("没有找到要修改的用户id!");

                                    }
                                    break;
                                case 3:
                                    System.out.println("谢谢使用");
                                    return;
                            }
                        }

                    }else{
                        //已经被禁用
                        System.out.println("该账户已被禁用!");
                    }
                }
                menu();
                break;
            case 2:
                break;
        }
    }
}
