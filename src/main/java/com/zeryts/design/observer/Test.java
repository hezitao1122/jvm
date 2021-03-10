package com.zeryts.design.observer;

import java.util.Observer;

/**
 * @author zeryts
 * @description: 观察者模式测试
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 22:02
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ConcreateObserver();
        subject.addObserver(observer);
        subject.setState(1);
    }

}
