package com.chan.oop.demo02;

public class Person {
    //一个类及时什么都不写,它也会存在一个方法
    //显式的定义构造器
    public String name;
    int age;

    //实例化初始值
    //1.使用new关键字,本质是在调用构造器
//    public Person(){
        //当new一个Person对象时 不传入name属性 这里自带给一个name属性
        //但如果传入了name属性 就使用传入的name
//        this.name = "paipaitou";
//    }

    //有参构造 当调用Person类时自动判断有没有参数 有参数走有参构造器 没有参数走无参构造器
    //一旦定义了有参构造,无参就必须显式定义 避免看不到无参Person类
    //Generator Constructor---自动生成有参构造器
    //select none ---生成无参构造器


    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
