package com.chan.array;

public class ArrayDemo01 {
    //变量的类型 变量的名字 = 变量的值
    public static void main(String[] args){
        int[] nums; //1.定义
        nums = new int[10];//这里面可以存放10个数组
        System.out.println(nums.length);
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
//        nums[9] = 10;//不指定默认0
        System.out.println(nums[9]);
        //计算所有元素的和
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            //遍历所有元素
            System.out.println(nums[i]);
        }
        //输出总和
        System.out.println(sum);
    }
}
