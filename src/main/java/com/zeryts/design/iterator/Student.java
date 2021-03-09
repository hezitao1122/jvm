package com.zeryts.design.iterator;

/**
 * @author zeryts
 * @description: 学生类
 * -----------------------------------
 * @title: Student
 * @projectName test-jvm
 * @date 2021/3/9 21:29
 */

public class Student {

    private String name ;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
