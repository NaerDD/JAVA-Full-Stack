package com.chan.array;

import java.util.Arrays;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,9090,124124,12,234};
//        System.out.println(a);//[I@74a14482

        //打印数组元素Arrays.toString
//        System.out.println(Arrays.toString(a));

//        printArray(a);
//        Arrays.sort(a);//升序 修改原数组
//        System.out.println(Arrays.toString(a));

        Arrays.fill(a,0);//数组填充 将a中所有元素 填充为0
        System.out.println(Arrays.toString(a));
    }
    //重复造轮子
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            } else if (i == a.length-1) {
                System.out.print(a[i]+"]");
            } else {
                System.out.print(a[i] + ",");
            }
        }
        }
    }
