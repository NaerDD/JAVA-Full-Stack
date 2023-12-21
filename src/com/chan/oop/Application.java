package com.chan.oop;

import com.chan.oop.demo02.Person;
import com.chan.oop.demo04.Student;

//一个项目应该只存一个main方法
public class Application {
    public static void main(String[] args) {


        //类:抽象的 需要实例化
//        Student s1 = new Student();
//        s1.name = "陈治文";
//        s1.age = 25;
//        s1.study();
//        System.out.println(s1.age);
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println("==========================");
        Student s1 = new Student();
        //私有属性拿不到
        //System.out.println(s1.name);
        //但是可以通过它里面提供的方法去操作私有属性
        System.out.println(s1.getName());
        s1.setName("czw");
        System.out.println(s1.getName());
        s1.setAge(999);//不合法
        System.out.println(s1.getAge());
       /*
       * 构造器
       * 1.和类名相同
       * 2.没有返回值
       * 作用:
       * 1.new本质在调用构造方法
       * 2.初始化对象的值
       * 注意点:
       * 1.定义有参构造之后,如果使用无参构造 必须要显式的定义 一个无参的构造器
       *
       * */


    }
}
