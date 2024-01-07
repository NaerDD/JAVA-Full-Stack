import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        System.out.println("请输入一个4-8的数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int flag = 0;
        String num2 = Integer.toString(num);
        if (num2.length() > 8 ||num2.length()< 4){
            System.out.println("数字长度不够!");
        }else{
            while (num!=0){
                flag = flag*10 + num%10;
                num = num/10;
            }
            if(flag==copy){
                System.out.println(copy+"是回文!");
            }else{
                System.out.println(copy+"不是回文!");
            }
        }
    }
}
