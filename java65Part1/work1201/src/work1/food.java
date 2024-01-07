package work1;

public class food {
//    1.	现有一组食品及其价格情况如下:
//    a)	牛肉干 :  12
//    b)	果冻 :  4
//    c)	豆腐干 : 	2
//            2.	收先创建食品类(Food),该类用于存储食品的名称和价格 10分
    String foodName;
    double foodPrice;

    public food(String foodName, double foodPrice) {
        setFoodName(foodName);
        setFoodPrice(foodPrice);
    }

    public food() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
}
