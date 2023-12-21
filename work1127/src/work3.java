import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        System.out.println("请输入你要查找的数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = {4,5,34,2,7,6};
        int flag = -1;
        int i = 0;
        for (;i < nums.length; i++) {
            if(num == nums[i]){
                flag = i;
                break;
            }
        }
        if (flag!=-1){
            System.out.println("找到了在"+i+"下标位置");
        }else{
            System.out.println("没有找到");
        }

    }
}
