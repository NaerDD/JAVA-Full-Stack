import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] color = {"黑桃","梅花","方块","红桃"};
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> poke = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                String temp = color[i] + num[j];
                poke.add(temp);
            }
        }
        System.out.println(poke);

        Random ran = new Random();
        int[] nums = new int[5];

        nums[0] = ran.nextInt(52)+1;
        for (int i = 1; i < 5; i++) {
            nums[i] = ran.nextInt(52)+1;
            for (int j = i-1; j >=0; j--) {
                if(nums[i]==nums[j]){
                    i--;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("你抓到了"+poke.get(nums[i]));
        }


    }
}