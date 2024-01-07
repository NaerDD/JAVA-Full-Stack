package RentCarSystem.User;

import RentCarSystem.Car.Car;
import RentCarSystem.login;

import java.util.ArrayList;
import java.util.Scanner;

//管理员账号
public class adminUser extends user{
    Scanner sc = new Scanner(System.in);
    public adminUser(String userName, String userPassword) {
        super(userName, userPassword);
    }

    public adminUser() {
    }

    public void menu(login login, ArrayList<Car> car){
        System.out.println("管理员账号菜单:1.查看所有车辆信息 2.添加车辆 3.删除车辆 4.退出");
        while (true){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num){
                case 1:
                    login.carQuery();
                    break;
                case 2:
                    System.out.println("输入要添加的车辆车牌号:");
                    String number = sc.next();
                    System.out.println("输入要添加的车辆品牌:");
                    String band = sc.next();
                    System.out.println("输入要添加的车辆颜色:");
                    String color = sc.next();
                    System.out.println("输入要添加的车辆日租金:");
                    double money = sc.nextDouble();
                    car.add(new Car(number,band,color,money));
                    break;
                case 3:
                    System.out.println("输入要删除的车辆车牌号:");
                    String number1 = sc.next();
                    int flag = -1;
                    for (int i = 0; i < car.size(); i++) {
                        if(car.get(i).getCarNumber().equals(number1)){
                            flag = i;
                            return;
                        }
                    }
                    if(flag!=-1){
                        car.remove(flag);
                        System.out.println("删除成功!");
                    }else{
                        System.out.println("没有你要删除的车辆信息");
                    }
                   break;
                case 4:
                    System.out.println("欢迎下次使用");
                    return;
            }
        }

    }
}
