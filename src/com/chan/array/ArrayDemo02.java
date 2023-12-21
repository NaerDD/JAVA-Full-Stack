package com.chan.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //打印全部的数组元素
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");
        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        System.out.println("sum="+sum);
        //查找最大元素
        System.out.println("=============");
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("最大的数是"+max);
    }
}
