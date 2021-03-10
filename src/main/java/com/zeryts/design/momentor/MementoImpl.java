package com.zeryts.design.momentor;

/**
 * @author zeryts
 * @description: 实现类
 * -----------------------------------
 * @title: MementtoImpl
 * @projectName test-jvm
 * @date 2021/3/11 6:55
 */
public class MementoImpl implements Memento{
    private String state;

    public MementoImpl(String state){
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }
}
