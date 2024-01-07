import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
//              9. 接收用户输入一个整数字 判断是否为回文数
                System.out.println("输入一个数:");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                String numCopy = String.valueOf(num);
                int yuan = num;
                int num2 = 0;
                for (int i = 0; i < numCopy.length() ; i++) {
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