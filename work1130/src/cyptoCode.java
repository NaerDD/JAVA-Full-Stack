import java.util.Scanner;
public class cyptoCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要加密的数字:");
        int num  = sc.nextInt();
        System.out.println(cyptonumbers(num));
    }
    public static int cyptonumbers(int num){
        int sum = 0;
        while (num!=0){
            sum = sum*10+(num%10+5)%10;
            num = num/10;
        }
        return sum;
    }
}
