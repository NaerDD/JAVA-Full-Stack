package RentCarSystem.User;

import RentCarSystem.Car.Car;
import RentCarSystem.login;

import java.util.ArrayList;

public abstract class user {

//    1. 车辆租赁公司管理系统
//    a)	所有用户需根据账号密码进行登录后方可进行后续操作
//          用户类   --- 分离出 用户 和 管理员
//    b)	可供租赁的车辆根据车型用途分为轿车，商务车，客车。
//          汽车类   --- 分离出 轿车 商务车 客车
//    c)	每台汽车都需要记录车牌号，品牌，颜色，日租金。客车根据座位数区分小客车和大客车，20座以上为大客车。

//    d)	普通用户和管理员登录后可查看不同车型现有的可供租赁车辆信息。同一车型车辆按价格降序展示。

//    e)	普通用户可根据自己的需求进行租车操作并结算。
//    f)	管理员可以添加新的车辆信息并对现有车辆信息进行维护。
//    g)	普通用户归还租赁车辆后，车辆信息重新上架。

    private String userName;
    private String userPassword;

    public user(String userName, String userPassword) {
        this.setUserName(userName);
        this.setUserPassword(userPassword);
    }

    public user() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public abstract void menu(login login, ArrayList<Car> car);
}
