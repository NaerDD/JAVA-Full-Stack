package com.chan.oop.demo05;
//老师 在JAVA中 所有的类 都默认直接或简介继承Object
public class Teacher extends Person{
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("除数不能为0");
        } finally {
            System.out.println("反正我要执行");
        }
    }
}
