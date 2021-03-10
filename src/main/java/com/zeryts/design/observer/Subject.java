package com.zeryts.design.observer;

import java.util.Observable;

/**
 * @author zeryts
 * @description: TODO
 * -----------------------------------
 * @title: Subject
 * @projectName test-jvm
 * @date 2021/3/10 21:59
 */
public class Subject extends Observable {

    private Integer state = 0;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        System.out.println("subject将状态修改为: " + state);
        this.setChanged();
        this.notifyObservers(state);
    }
}
