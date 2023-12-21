package com.chan.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,9090,124124,12,234};
        int[] sort = sort1(a);
        System.out.println(Arrays.toString(sort));
    }
    //冒泡排序
    //1.比较数组中,两个相邻的元素,如果第一个数比第二个数大,就交换他们的位置
    //2.每一次比较,都会产生一个最大,或者最小的数字
    //3.下一轮可以少一次排序
    //4.一次循环,直到结束
    //时间复杂度为O(n2)
    //如何优化?

    public static int[] sort1(int[] array) {
        //临时变量
        int bigger = 0;
        //外层循环,判断我们这个要走多少次;
        for (int i = 0; i < array.length-1; i++) {
            //内层循环,比较两个数,如果第一个数大 交换位置
            for (int j = 0; j < array.length-1-i; j++) {

                if(array[j]>array[j+1]){
                    bigger = array[j];
                    array[j] = array[j+1];
                    array[j+1] = bigger;
                }
            }
        }
        return array;
    }
}
