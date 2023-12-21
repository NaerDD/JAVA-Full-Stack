package com.chan.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};

        System.out.println(array[0][0]);
        System.out.println(array[0][1]);

    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
