package com.chan.operate;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数
        int m = 0;
        System.out.println("请输入数字");
        //通过循环判断是否还有输入,并在里面对每一次进行求和统计
        while(s1.hasNextDouble()){
            double x = s1.nextDouble();
            System.out.println("你输入了第"+m+"个数据");
            //m=m+1/结果不同m=m++
            m++;
            sum = sum + x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均数为"+(sum/m));

        s1.close();
    }
}
