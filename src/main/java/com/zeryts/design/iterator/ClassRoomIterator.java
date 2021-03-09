package com.zeryts.design.iterator;

import java.util.Iterator;

/**
 * @author zeryts
 * @description: 教室迭代器
 * -----------------------------------
 * @title: ClassRoomIterator
 * @projectName test-jvm
 * @date 2021/3/9 21:39
 */
public class ClassRoomIterator implements Iterator {

    private ClassRoom classRoom;

    private int index;


    public ClassRoomIterator(ClassRoom classRoom){
        this.classRoom = classRoom;
        this.index = 0;
    }

    /**
     * 判断是否还有下一个元素，
     * 存在的话返回true，允许继续遍历，
     * 不存在的话返回false，则结束遍历
     * @return Boolean
     */
    @Override
    public boolean hasNext() {
        return index < classRoom.getStudents().length;
    }

    /**
     * 获取当前的元素,并且将角标+1
     * @return
     */
    @Override
    public Object next() {
        Student student = classRoom.getStudent(index);
        index ++ ;
        return student;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public int getIndex() {
        return index;
    }
}
