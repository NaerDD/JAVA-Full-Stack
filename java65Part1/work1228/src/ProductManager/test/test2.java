package ProductManager.test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        //5个数
        for (int i = 0; i < 5; i++) {
            //默认要加进去
            boolean flag = true;
            //生成一个数
            int num = ran.nextInt(10) + 1;
            for (int j = 0; j < i; j++) {
                //如果这个数 和之前的数相同 不添加 且i--
                if (list.get(j) == num) {
                    flag = false;
                    i--;
                    break;
                }
            }
            if(flag){
                list.add(num);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

