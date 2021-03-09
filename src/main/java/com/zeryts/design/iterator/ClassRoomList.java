package com.zeryts.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zeryts
 * @description: 教室,使用List来存放学生的方法
 * -----------------------------------
 * @title: ClassRoomList
 * @projectName test-jvm
 * @date 2021/3/9 22:04
 */
public class ClassRoomList {

    private String name;

    private List<Student> students;

    private int index = 0;

    public ClassRoomList(int size){
        students = new ArrayList<>(size);
    }

    public void addStudent(Student student){
        students.add(student);
        index ++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getSize(){
        return students.size();
    }
    public Student getStudent(int index) {
        return students.get(index);
    }


    /** description: 返回一个迭代器
     * @return: java.util.Iterator
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/9 22:01
     */
    public Iterator iterator(){
        return new ClassRoomListIterator(this);
    }
}
