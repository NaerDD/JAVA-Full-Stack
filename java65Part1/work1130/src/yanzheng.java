import java.util.*;
public class yanzheng {
    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println("要几位验证码:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] stringNum = nums(num);
        //创建一个装最终验证码的字符串
        String result = "";
        //拿着每一位分别去调用 数字 大写字母 小写字母
        for (int i = 0; i < stringNum.length; i++) {
            if(stringNum[i]==1){
                //数字
                result = result+ranNumber();
            }else if (stringNum[i]==2){
                //大写字母
                result = result+(char)((int)ran.nextInt(25)+65);
            }else{
                //小写字母
                result = result+(char)((int)ran.nextInt(25)+97);
            }
        }
        System.out.println(result);
    }

    //生成每一位上的随机数字 1-3
    public static int[] nums(int num){
        Random ran = new Random();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = (int)ran.nextInt(3)+1;
        }
        return numbers;
    }

    //随机生成一个1-9的数字
    public static int ranNumber(){
        Random ran = new Random();
        return (int)ran.nextInt(9)+1;
    }

    Random ran = new Random();
}
