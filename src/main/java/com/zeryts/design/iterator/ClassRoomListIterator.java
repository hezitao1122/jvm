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
public class ClassRoomListIterator implements Iterator {

    private ClassRoomList classRoom;

    private int index;


    public ClassRoomListIterator(ClassRoomList classRoom){
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
        return index < classRoom.getSize();
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

    public ClassRoomList getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoomList classRoom) {
        this.classRoom = classRoom;
    }

    public int getIndex() {
        return index;
    }
}
