package com.chan.operate;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        //创建一个扫描器对象,用于接收键盘数据
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入整数:");

        int i = 0;
        float f = 0.0f;

        //判断用户有没有输入字符串
        if(s1.hasNextInt()){
            i = s1.nextInt();
            System.out.println("输出的内容为:"+i);
        }else{
            System.out.println("输入的不是整数数据!");
        }

        //凡是属于输入/输出的类 如果不关闭会一直占用资源.
        //关闭扫描器
        s1.close();
    }
}
