package Data;

import bean.TieZi;
import bean.User;

import java.util.ArrayList;

public class Data {
    //所有楼主集合
    public static ArrayList<User> allLouzhu = new ArrayList<>();

    //所有用户集合
    public static ArrayList<User> allUser = new ArrayList<>();

    //所有帖子集合
    public static ArrayList<TieZi> allTiezi = new ArrayList<>();

    //登陆集合
    public static ArrayList<User> Logined  = new ArrayList();


    static {
        allUser.add(new User("666","naer","123","男",18,1));
        allUser.add(new User("667","aaa","123","女",18,2));
        allUser.add(new User("668","bbb","123","男",18,3));
        //1.情感,2.社会,3.国际,4.娱乐
        allTiezi.add(new TieZi(1,"情感",":情感问题咨询",10,"668",3,"男"));
        allTiezi.add(new TieZi(2,"社会",":社会问题咨询",11,"666",3,"男"));
        allTiezi.add(new TieZi(3,"国际",":国际问题咨询",12,"667",3,"男"));
        allTiezi.add(new TieZi(4,"娱乐",":娱乐问题咨询",13,"668",3,"男"));
    }




}
