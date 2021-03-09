package com.zeryts.design.adapter;

/**
 * @author zeryts
 * @description: 新接口的代理
 * -----------------------------------
 * @title: NewInterfaceAdapter
 * @projectName test-jvm
 * @date 2021/3/10 5:49
 */
public class NewInterfaceAdapter implements NewInterface{

    private OldInterface oldInterface;

    public NewInterfaceAdapter(OldInterface oldInterface){
        this.oldInterface = oldInterface;
    }

    @Override
    public void newSay() {
        System.out.println("执行新接口规范!");
        oldInterface.oldSay();
    }
}
