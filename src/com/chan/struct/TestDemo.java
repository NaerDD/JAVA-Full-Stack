package com.chan.struct;

public class TestDemo {
    public static void main(String[] args) {
        //打印三角形 5行
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
