import java.util.Arrays;
public class work62 {
        public static void main(String[] args) {
        // 6.现有一组数{3,12,5,6,11,8,7}请编写Java程序求租该组数的最大值和最小值.(请编写2种方法实现)
            int[] arr = {3,12,5,6,11,8,7};
            Arrays.sort(arr);
            System.out.println("最小值: " + arr[0]);
            System.out.println("最大值: " + arr[arr.length - 1]);
        }
    }