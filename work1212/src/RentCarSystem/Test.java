package RentCarSystem;

import RentCarSystem.User.user;
import java.util.Scanner;

import static RentCarSystem.login.car;

public class Test {
    public static void main(String[] args) {
       login login = new login();
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入用户名:");
       String  userName = sc.next();
        System.out.println("请输入密码:");
       String  userPwd = sc.next();
       //调用登陆方法 会返回一个user对象
       user user = login.query(userName,userPwd);
        if (user!=null){
            //如果返回对象不为空 调用对象的menu方法
            user.menu(login,car);
        }else{
            System.out.println("卡号或密码有误!");
        }
    }
}
