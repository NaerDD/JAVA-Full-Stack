import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
//        6、 接收用户输入3个数,求出3个数的大小顺序;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数:");
        int num2 = sc.nextInt();
        System.out.println("输入第三个数:");
        int num3 = sc.nextInt();

        if(num1>num2){
            if(num2>num3){
                System.out.println("顺序为num1>num2>num3");
            }else{
                if(num1>num3){
                    System.out.println("顺序为num1>num3>num2");
                }else{
                    System.out.println("顺序为num3>num1>num2");
                }
            }
        }else if(num3>num2){
            System.out.println("num3>num2>num1");
        }else if (num2>num3){
            if (num1>num3){
                System.out.println("num2>num1>num3");
            }else{
                System.out.println("num2>num3>num1");
            }
        }
    }
}
