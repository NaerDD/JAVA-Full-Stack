package com.chan.operate;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        //创建一个扫描器对象,用于接收键盘数据
        Scanner s1 = new Scanner(System.in);
        System.out.println("使用next方式接收您接下来输入的数据:");

        //判断用户有没有输入字符串
        if(s1.hasNextLine()){
            String str = s1.nextLine();
            System.out.println("输出的内容为:"+str);
        }

        //凡是属于输入/输出的类 如果不关闭会一直占用资源.
        //关闭扫描器
        s1.close();
    }
}
