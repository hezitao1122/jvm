package com.zeryts.design.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zeryts
 * @description: 教室
 * -----------------------------------
 * @title: ClassRoom
 * @projectName test-jvm
 * @date 2021/3/9 21:30
 */

public class ClassRoom {

    private String name;

    private Student [] students;

    private int index = 0;

    public ClassRoom(int size){
        students = new Student[size];
    }

    public void addStudent(Student student){
        students[index] = student;
        index ++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }
    public Student getStudent(int index) {
        return students[index];
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }


    /** description: 返回一个迭代器
     * @return: java.util.Iterator
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/9 22:01
     */
    public Iterator iterator(){
        return new ClassRoomIterator(this);
    }
}
