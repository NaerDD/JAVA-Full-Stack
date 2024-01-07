package work1;

import java.util.Scanner;

public class FoodManager {
    Scanner sc = new Scanner(System.in);
    //创建一个food 数组 最大长度500
    food[] foodList = new food[10];
    //数组指针
    int count = 0;
    //无参构造 初始化
    public FoodManager(){
        //    a)	牛肉干 :  12
        //    b)	果冻 :  4
        //    c)	豆腐干 : 	2
        //初始化时 自带3件商品
        foodList[0]=new food("牛肉干",20);
        foodList[1]=new food("果冻",4);
        foodList[2]=new food("豆腐干",2);
        count = 2;
        showAll();
    }
    //0.查看所有商品方法
    public void showAll(){
        for (int i = 0; i < foodList.length; i++) {
            if(foodList[i]!=null) {
                System.out.println(foodList[i].getFoodName() + " " + foodList[i].getFoodPrice());
            }
        }
    }

    //1、添加新商品方法
    public void addFood(String foodName,double foodPrice){
        //将商品加到count+1的位置下
        foodList[count+1]=new food(foodName,foodPrice);
        System.out.println("商品添加完成。");
        System.out.println(foodList[count+1].getFoodName()+" "+foodList[count+1].getFoodPrice());
        //添加完成后 将指针后移
        count+=1;
    }

    //2.查询食品信息(name)
    public int queryFood(String name){
        int flag = -1;
        for (int i = 0; i < foodList.length; i++) {
            if(foodList[i]!=null) {
                if (foodList[i].getFoodName().equals(name)) {
                    flag = i;
                }
            }
        }
        return flag;
    }

    //3.根据食品名称，修改食品价格   15分
    public void modifyPrice(String name) {
        int flag = queryFood(name);
        if(flag!=-1){
            //找到了
            System.out.println("输入要修改的价格:");
            foodList[flag].setFoodPrice(sc.nextInt());
        }
        System.out.println("修改成功");
    }

    //菜单
//    1.	可添加新食品.  15分
//    2.	根据食品名称，查询食品信息   15分
//    3.	根据食品名称，修改食品价格   15分
//    4.	计算所有食品总价		10分
//    5.	统计所有食品中最贵的商品信息  15分
//    6.	按照食品的价格升序排序输出这些食品的信息10分
//    7.	退出
    public void menu(){
        a:while (true){
            System.out.println("0.查看所有商品 1.添加新食品 2.查寻食品(名称) 3.修改价格(名称) 4.计算所有食品总价 5.最贵的商品信息 6.升序排列(按照价格) 7.退出");
            int choose = sc.nextInt();
            switch (choose){
                case 0:
                    showAll();
                    break;
                case 1:
                    //添加新食品
                    System.out.println("请输入要添加食品的名称:");
                    String foodName = sc.next();
                    System.out.println("请输入要添加食品的价格:");
                    double foodPrice = sc.nextDouble();
                    addFood(foodName,foodPrice);
                    break;
                case 2:
                    System.out.println("输入要找的食品名称:");
                    String FoodName = sc.next();
                    int flag = queryFood(FoodName);
                    if(flag!=-1){
                        //找到了
                        System.out.println("找到了!");
                        System.out.println(foodList[flag].getFoodName()+" "+foodList[flag].getFoodPrice());
                    }else{
                        //没找到
                        System.out.println("没找到!");
                    }
                    break;
                case 3:
                    System.out.println("输入要找的食品名称:");
                    String name = sc.next();
                    modifyPrice(name);
                    break;
                case 4:
                    //计算所有食品总价
                    double sum = 0;
                    for (int i = 0; i < foodList.length; i++) {
                        if(foodList[i]!=null) {
                            sum += foodList[i].getFoodPrice();
                        }
                    }
                    System.out.println("总价格为:"+sum);
                    break ;
                case 5:
                    //最贵的商品信息
                    double max = 0;
                    int i = 0;
                    for (;i < foodList.length; i++) {
                        if(foodList[i]!=null) {
                            assert foodList[(int) max] != null;
                            if(foodList[(int)max].getFoodPrice()<foodList[i].getFoodPrice()) {
                                max = i;
                            }
                        }
                    }
                    assert foodList[(int) max] != null;
                    System.out.println("最贵的商品是"+foodList[(int)max].getFoodName());
                    break ;
                case 6:
                    //升序排列
                    for (int j = 0; j < foodList.length ; j++) {
                        for (int k = j+1; k < foodList.length-1; k++) {
                            if(foodList[j]!=null){
                                if(foodList[k]!=null){
                                if(foodList[j].getFoodPrice()>foodList[k].getFoodPrice()){
                                    food tempfood = new food();
                                    tempfood.setFoodPrice(foodList[j].getFoodPrice());
                                    tempfood.setFoodName(foodList[j].getFoodName());
                                    foodList[j].setFoodPrice(foodList[k].getFoodPrice());
                                    foodList[j].setFoodName(foodList[k].getFoodName());
                                    foodList[k].setFoodPrice(tempfood.getFoodPrice());
                                    foodList[k].setFoodName(tempfood.getFoodName());
                                }
                                }
                            }
                        }
                    }
                    showAll();
                    break;
                case 7:
                    System.out.println("欢迎下次使用");
                    break a;
                default:
                    System.out.println("错误的选择!请重新输入");
                    break;
            }

        }
    }

}
