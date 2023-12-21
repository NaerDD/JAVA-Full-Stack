package com.chan.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int s = s1.nextInt();

        //equals:判断字符串是否相等
        if(s>60){
            System.out.println("及格");
        }else{
            System.out.println("bu及格");
        }
        s1.close();
    }
}
