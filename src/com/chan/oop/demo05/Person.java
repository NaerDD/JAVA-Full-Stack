package com.chan.oop.demo05;
//Person 人
public class Person {
    //public
    //private 私有的子类无法继承
    //default 不写
    //protected 受保护的
    private int money = 10_0000_0000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
        System.out.println("说了一句话");
    }
}
