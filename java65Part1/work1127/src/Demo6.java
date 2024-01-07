import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        //已知一个整型数组
        int[] nums = {11,24,14,8,19,3};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"  ");
        }
        //接受用户输入一个整数 追加到数组nums当中
        System.out.println("请输入要添加的数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] numsCopy = nums;

        nums = new int[nums.length+1];

        for (int i = 0; i < nums.length; i++) {
            if(i != numsCopy.length){
                nums[i] = numsCopy[i];
            }else{
                nums[i] = num;
            }
        }

        System.out.println("新增后的数组为:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"  ");
        }

    }
}
