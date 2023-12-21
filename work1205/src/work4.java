import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
//        输入一个18位的身份证号码，提取出该用户的生日
        System.out.println("输入一个身份证:");
        Scanner sc = new Scanner(System.in);
        String IDcard = sc.next();
        String year = IDcard.substring(6,10);
        String month = IDcard.substring(10,12);
        String day = IDcard.substring(12,14);
        System.out.println("该用户的生日是:"+year+"年"+month+"月"+day+"日");
//        500237199702181591
    }
}
