import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个数:");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];
        }
        System.out.println("合为:"+sum);
    }
}
