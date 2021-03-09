package com.zeryts.design.iterator;

import java.util.Iterator;

/**
 * @author zeryts
 * @description: 迭代器模式测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/9 21:48
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(23);

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(24);

        ClassRoom classRoom = new ClassRoom(2);

        classRoom.addStudent(s1);
        classRoom.addStudent(s2);

        Iterator iterator = classRoom.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ClassRoomList classRoomList = new ClassRoomList(2);
        classRoomList.addStudent(s1);
        classRoomList.addStudent(s2);

        Iterator iteratorList = classRoomList.iterator();
        while(iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }

    }
}
