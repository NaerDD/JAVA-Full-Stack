import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
//        2、一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        System.out.println("输入一个5位数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int yuan = num;
        int num2 = 0;
        for (int i = 0; i < 5; i++) {
            num2 = num2 * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(num2);
        if (yuan == num2) {
            System.out.println("是一个回文数");
        } else {
            System.out.println("不是一个回文数");
        }
    }
}
