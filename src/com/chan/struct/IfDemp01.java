package com.chan.struct;

import java.util.Scanner;

public class IfDemp01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入内容:");
        String s = s1.nextLine();

        //equals:判断字符串是否相等
        if(s.equals("hello")){
            System.out.println(s);
        }
        System.out.println("end");
        s1.close();
    }
}
