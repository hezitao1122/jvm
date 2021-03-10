package com.zeryts.design.momentor;

/**
 * @author zeryts
 * @description: 组织
 * -----------------------------------
 * @title: Originator
 * @projectName test-jvm
 * @date 2021/3/11 6:42
 */
public class Originator {
    private String state;

    private Memento memento;

    public void prepare() {
        this.state = "中间数据";
    }

    public void executeA() {
        System.out.println("基于中间数据[" + state + "]进行了A方法的执行!");
        state += " , A方法的结果数据";
    }

    public void executeB() {
        System.out.println("基于中间数据[" + state + "]进行了B方法的执行!");
        state += " , B方法的结果数据";
    }


    public Memento createMemento() {
        return new MementoImpl(state);
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
        this.state = memento.getState();
    }
}
