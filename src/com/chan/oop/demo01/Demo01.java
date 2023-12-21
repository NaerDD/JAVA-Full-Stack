package com.chan.oop.demo01;

import java.io.IOException;

//Demo01类
public class Demo01 {
    //main方法
    public static void main(String[] args) {
        max(1,2);

    }

    public String sayHello(){
        return "hello world";
    }

    public void Hello(){
        return;
    }
    public static int max(int a, int b){
        return a>b ? a : b;
    }
    public void readFile(String file)throws IOException{

    }
}
