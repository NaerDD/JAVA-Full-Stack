import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("请问需要多少个数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数:");
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
        }

        int max = nums[0];
        for (int k = 0; k < nums.length; k++) {
            if (nums[k]>max){
                max = nums[k];
            }
        }
        System.out.println("平均数:"+sum/ nums.length +"最大值:"+max);
    }
}
