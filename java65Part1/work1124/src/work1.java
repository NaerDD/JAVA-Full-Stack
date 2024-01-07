import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
//        2.打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个“水仙花数”，因为153=1的三次方+5的三次方+3的三次方。
        System.out.println("输入一个数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100;
        if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==num){
            System.out.println("是一个水仙花数");
        }else{
            System.out.println("不是一个水仙花数");
        }
    }
}
