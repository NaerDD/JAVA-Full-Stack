package RentCarSystem;

import RentCarSystem.Car.Car;
import RentCarSystem.Car.CustomerCar.bCustomerCar;
import RentCarSystem.Car.CustomerCar.sCustomerCar;
import RentCarSystem.Car.bussnessCar;
import RentCarSystem.Car.smartCar;
import RentCarSystem.User.adminUser;
import RentCarSystem.User.standrUser;
import RentCarSystem.User.user;

import java.util.ArrayList;

public class login {
    static ArrayList<Car> car = new ArrayList();
    static ArrayList<user> users = new ArrayList();
    //添加默认车辆
    static {
        //商务车
        car.add(new bussnessCar("1100","本田","白色",100));
        //轿车
        car.add(new smartCar("2101","奔驰","黑色",200));
        car.add(new smartCar("2102","奥迪","蓝色",300));
        car.add(new smartCar("2103","宝马","红色",400));
        //客车
        //大巴车  20人以上
        car.add(new bCustomerCar("3101","大巴车","红色",400,30));
        car.add(new bCustomerCar("3102","大巴车","红色",400,30));
        //中吧车 20人以下
        car.add(new sCustomerCar("3103","中巴车","红色",300,15));
        car.add(new sCustomerCar("3104","中巴车","红色",300,15));
        car.add(new sCustomerCar("3105","中巴车","红色",300,15));
    }
    //添加默认账户
    static {
        //普通用户
        users.add(new standrUser("cz","123456"));
        //管理员用户
        users.add(new adminUser("root","123456"));
    }

    //根据账号登录 判断是用户还是管理员
    public user query(String userName,String userPassword){
        int flag = -1;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUserName().equals(userName) & users.get(i).getUserPassword().equals(userPassword)){
                flag=i;
                break;
            }
        }
        //将用户返回
        return flag==-1?null:users.get(flag);
    }

    //查询所有车
    public void carQuery(){
        System.out.println("车牌号:          品牌:              颜色:          日租金:");
        //排序 降序
        for (int i = 0; i < car.size(); i++) {
            for (int j = i+1; j <car.size(); j++) {
                if(car.get(i).getMoneyOfDay()<car.get(j).getMoneyOfDay()){
                    Car temp = new Car();
                    temp = car.get(i);
                    car.set(i,car.get(j));
                    car.set(j,temp);
                }
            }
        }
        //遍历输入
        for (Car value : car) {
            if (value instanceof sCustomerCar) {
                sCustomerCar customerCar = (sCustomerCar) value;
                System.out.println(customerCar.getCarNumber() + "\t\t" + customerCar.getBand() + "\t\t" + customerCar.getColor() + "\t\t" + customerCar.getMoneyOfDay() + "\t座位数:" + customerCar.getSetNumber());
            } else if (value instanceof bCustomerCar) {
                bCustomerCar bcustomerCar = (bCustomerCar) value;
                System.out.println(bcustomerCar.getCarNumber() + "\t\t" + bcustomerCar.getBand() + "\t\t" + bcustomerCar.getColor() + "\t\t" + bcustomerCar.getMoneyOfDay() + "\t座位数:" + bcustomerCar.getSetNumber());
            } else {
                System.out.println(value.getCarNumber() + "\t\t" + value.getBand() + "\t\t" + value.getColor() + "\t\t" + value.getMoneyOfDay());
            }
        }
    }

}
