import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
//        10、输入一个已经按升序排序过的数组，再输入一个数字，在数组中查询两个数字，使得它们的和与你输出的那个数字相等，输出任意一对即可，如：
        int[]  arr={1,2,4,7,11,15};
//        要查询的数字：5      1+4=5
//        要查询的数字：100    没有符合条件的结果
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要查询的数字:");
        int num = sc.nextInt();
        int flag1 = 0;
        int flag2 = 0;
        a:for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==num){
                    flag1 = i;
                    flag2 = j;
                    break a;
                }
            }
        }
        if(flag1==0&&flag2==0){
            System.out.println("没有满足条件的数字组合");
        }else{
            System.out.println(arr[flag1]+"+"+arr[flag2]+"="+num);
        }
    }
}
