import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
//        1、	使用带参数的方法完成以下内容：
//        定义一个Calc类,里面有计算加、减、乘、除的四个方法，
//        在程序入口，用户输入两个数字，并调用Calc类中的方法
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String str = calc(num1,num2);
        System.out.println(str);
    }
    public static String calc(int num1,int num2){
        int jia = num1+num2;
        int jian = num1-num2;
        int cheng = num1*num2;
        int chu = num1/num2;
        return "两个数字的合是"+jia+"两个数字的差是"+jian+"两个数字的乘是"+cheng+"两个数字的除是"+chu;
    }
}
