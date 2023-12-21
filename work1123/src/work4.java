import java.util.Random;
import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
//        6.猜数字游戏，请由电脑随机生成一个1-10的随机数，接受用户输入，提示正确，太大，或者太小。
        Random num = new Random();
        int num2= num.nextInt(10);
        System.out.println("请猜一个数字:");
        Scanner sc = new Scanner(System.in);
        int xx = sc.nextInt();
        if(xx == num2){
            System.out.println("猜对了");
        }else if(xx >num2){
            System.out.println("猜错了,太大");
        }else{
            System.out.println("猜错了,太小");
        }
    }
}
