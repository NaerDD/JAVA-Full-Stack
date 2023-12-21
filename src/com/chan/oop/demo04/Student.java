package com.chan.oop.demo04;
//1.提高程序的安全性 保护数据
//2.隐藏代码的实现细节
//3.统一接口
//4.提高系统的可维护性
public class Student {
    //属性私有
    private String name;
    private int id;
    private char sex;
    private int age;

    //提供一些可以操作这个属性的方法
    //get 拿到该属性
    public String getName(){
        return this.name;
    }
    //set 修改该属性
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120||age<0){ //不合法
            this.age = 3;
        }else{
            this.age =age;
        }
    }
}