package Manager;

import java.util.ArrayList;
import java.util.Scanner;
import Data.Data;
import bean.TieZi;
import bean.User;
import util.PostType;

public class Manager {
    Scanner sc = new Scanner(System.in);

    //注册功能 向所有用户集合中添加一条用户数据
     public void registerUser(User user){
            for (int i = 0; i < Data.allUser.size(); i++) {
                if (user.equals(Data.allUser.get(i))) {
                    System.out.println("相同的用户名!用户已经存在!");
                    //已经存在该用户 停止
                    return;
                }
            }
            //全部扫描完毕 没有相同 添加
            Data.allUser.add(user);
            System.out.println("注册成功!");
        }

     //登陆功能
     public void userLogin(String id,String pwd){
         for (int i = 0; i < Data.allUser.size(); i++) {
             if (id.equals(Data.allUser.get(i).getUserAccount()) & pwd.equals(Data.allUser.get(i).getUserPassword())){
                 System.out.println("登陆成功!");
                 //将用户添加到已经登陆成功集合
                 Data.Logined.add(Data.allUser.get(i));
                return;
             }
         }
         //全部扫描完 账号或密码不对
         System.out.println("账号或密码错误!");
     }

    //根据帖子类型打印
    private void printTieziByType(String type) {
        for (int i = 0; i < Data.allTiezi.size(); i++) {
            if (Data.allTiezi.get(i).gettType().equals(type)) {
                //特定类型的帖子集合
                ArrayList<TieZi> list = new ArrayList<>();
                //特定类型的帖子集合
                list.add(Data.allTiezi.get(i));
                //输出
                System.out.println(Data.allTiezi.get(i).gettManagerName()+Data.allTiezi.get(i).gettRecoed());
                //访问次数+1次
                Data.allTiezi.get(i).settQueryNumber(Data.allTiezi.get(i).gettQueryNumber()+1);
                System.out.println("输入你要留的言:");
                    String liuyan = sc.next();
                    //必须先登陆
                    list.get(0).settRecoed(list.get(0).gettRecoed()+"\n"+Data.Logined.get(0).getUserName()+":"+liuyan);
            }
        }
    }

    //菜单
    public void menu() {
        System.out.println("欢迎来到XX论坛!");
        System.out.println("1.注册 2.登陆 3.看帖子 4.退出");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                //注册
                System.out.println("输入你要注册的账号:");
                String id = sc.next();
                System.out.println("输入你的用户名:");
                String name = sc.next();
                System.out.println("输入你要注册的密码:");
                String pwd = sc.next();
                System.out.println("输入你的性别:");
                String gender = sc.next();
                System.out.println("输入你的年龄:");
                int age = sc.nextInt();
                registerUser(new User(id,name,pwd,gender,age,1));
                menu();
                break;
            case 2:
                //登陆
                System.out.println("输入你的账号:");
                String id1 = sc.next();
                System.out.println("输入你的密码:");
                String pwd1 = sc.next();
                userLogin(id1,pwd1);
                menu();
                break;
            case 3:
                System.out.println("输入你要查看的帖子类型:E 情感 S 社会 I 国际  EN 国际");
                PostType postType = PostType.valueOf(sc.next()); //读取枚举值
                switch (postType) { // 使用枚举值进行判断
                    case E:
                        System.out.println("帖子类型: 情感");
                        printTieziByType("情感");

                        break;
                    case S:
                        System.out.println("帖子类型: 社会");
                        printTieziByType("社会");
                        break;
                    case I:
                        System.out.println("帖子类型: 国际");
                        printTieziByType("国际");
                        break;
                    case EN:
                        System.out.println("帖子类型: 娱乐");
                        printTieziByType("娱乐");
                        break;
                    default: // 处理未知的帖子类型，可以根据需要添加更多的处理逻辑
                        System.out.println("未知的帖子类型");
                        break;
                }
                menu();
                break;
            case 4:
                //清空登陆列表
                Data.Logined.clear();
                break;
        }
    }

}
