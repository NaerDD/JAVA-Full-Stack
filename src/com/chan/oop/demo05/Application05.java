package com.chan.oop.demo05;

import com.chan.oop.demo05.Student;

public class Application05 {
    public static void main(String[] args) {
        Student student = new Student();
        student.say();
        System.out.println(student.getMoney());
        student.setMoney(1000);
        System.out.println(student.getMoney());
    }
}
