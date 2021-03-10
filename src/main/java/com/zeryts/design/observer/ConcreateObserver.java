package com.zeryts.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zeryts
 * @description: 触发的方法
 * -----------------------------------
 * @title: ConcreateObserver
 * @projectName test-jvm
 * @date 2021/3/10 22:01
 */
public class ConcreateObserver implements Observer {
    @Override
    public void update(Observable observable, Object args) {
        Integer state = (Integer)args;
        System.out.println("目标状态变化为:" + state);
    }
}
