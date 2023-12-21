import java.util.Scanner;

public class airport {
    public static void main(String[] args) {
        System.out.println("请输入机票原价:");
        Scanner sc = new Scanner(System.in);
        double oPrice = sc.nextDouble();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        String result1 = danwangji(month);
        System.out.println("请输入舱位: 1.头等舱 2.经济舱");
        int position = sc.nextInt();
        String result2 = cangwei(position);
        double sum = sumPrice(oPrice,result1,result2);
        System.out.println("总价为:"+sum);
    }

    public static String danwangji(int month){
        if(month>=5 & month<=10){
            return "旺季";
        }else{
            return "淡季";
        }
    }

    public static String cangwei(int position){
        if(position==1){
            return "头等舱";
        }else{
            return "经济舱";
        }
    }

    public static double sumPrice(double oPrice,String result1,String result2){
        if (result1.equals("旺季")){
            if (result2.equals("头等舱")){
                return oPrice=oPrice*0.9;
            }else{
                //旺季 经济舱
                return oPrice=oPrice*0.85;
            }
        }else{
            //淡季
            if(result2.equals("头等舱")){
                return oPrice=oPrice*0.7;
            }else{
                //淡季 经济舱
                return oPrice=oPrice*0.65;
            }
        }
    }
}
