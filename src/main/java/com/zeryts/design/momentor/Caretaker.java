package com.zeryts.design.momentor;

/**
 * @author zeryts
 * @description: 备忘录类
 * -----------------------------------
 * @title: Caretaker
 * @projectName test-jvm
 * @date 2021/3/11 6:53
 */
public class Caretaker {
    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retriveMemento() {
        return this.memento;
    }
}
