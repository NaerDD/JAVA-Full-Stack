package RentCarSystem.User;

import RentCarSystem.Car.Car;
import RentCarSystem.login;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

//标准账号
public class standrUser extends user{

    public standrUser(String userName, String userPassword) {
        super(userName, userPassword);
    }

    public standrUser() {
    }

    public ArrayList<Car> rentCard(login login, ArrayList<Car> car,ArrayList<Car> userShopCar){
        System.out.println("输入你要租车的车牌号:");
        Scanner sc = new Scanner(System.in);
        String rentInfo = sc.next();
        int flag = -1;
        for (int i = 0; i < car.size(); i++) {
            if(car.get(i).getCarNumber().equals(rentInfo)){
                flag = i;
                break;
            }
        }
        if(flag!=-1){
            //找到了
            System.out.println("请输入你要租的天数:");
            int day = sc.nextInt();
            System.out.println("价格为"+car.get(flag).getMoneyOfDay()*day);
            //用户购物车

            userShopCar.add(car.get(flag));
            car.remove(flag);
            System.out.println("租车成功");
            return userShopCar;
        }else{
            //没找到
            System.out.println("没有你要查找的车辆");
            return null;
        }

    };

    public void reCar(ArrayList<Car> car,ArrayList<Car> userShopCar){
        //租车队列中没车
        if(userShopCar.size()==0){
            return;
        }
        int flag = -1;
        for (int i = 0; i < userShopCar.size(); i++) {
            if(userShopCar.get(i).getCarNumber().equals(car.get(i).getCarNumber())){
                flag = i;
            }
        }
        if(flag!=-1){
            //在购物车中找到了
            //添加回原队列
            car.add(userShopCar.get(flag));
            //从车中删除
            userShopCar.remove(flag);
        }
    };

    public void menu(login login, ArrayList<Car> car){
        System.out.println("标准账号菜单:1.查看所有车辆信息 2.租车操作并结算 3.还车 4.退出");
        Scanner sc = new Scanner(System.in);
        //初始化用户购物车
        ArrayList<Car> userShopCar = new ArrayList<>();

        while (true){
            int num = sc.nextInt();
            switch (num){
                case 1:
                    login.carQuery();
                    break;
                case 2:
                    rentCard(login,car,userShopCar);
                    break;
                case 3:
                    reCar(car,userShopCar);
                    System.out.println("还车成功");
                    break;
                case 4:
                    System.out.println("谢谢使用");
                    return;
            }
        }

    }
}
