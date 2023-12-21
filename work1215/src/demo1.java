import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        //生成5个1-10不重复的随机数
        Random ran = new Random();
        int[] arr = new int[5];
        //第一次
        arr[0] = ran.nextInt(10)+1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = ran.nextInt(10)+1;
            for (int j = 0; j < i; j++) {
                if(arr[j] == arr[i]){
                    i--;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " \t");
        }
    }
}
