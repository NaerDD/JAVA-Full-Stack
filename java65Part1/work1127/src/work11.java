import java.util.Random;

public class work11 {
    public static void main(String[] args) {
//        11、使用java随机生成1000次 范围在 -500~500的整数，然统计每个随机数字出现的次数
        Random ran = new Random();
        int[] arr  = new int[1000];
        int[] count  = new int[1000];
        for (int i = 0; i < 1000; i++) {
            //将生成的数字 依次添加到arr数组当中去
            arr[i] = ran.nextInt(1000)-500;
            count[arr[i]+500]++; // 统计出现次数
        }
        // 打印出所有的数字和它们出现的次数
        for (int i = -500; i < 500; i++) {
            System.out.println(i + "出现的次数：" + count[i+500]);
        }
    }
}
