package com.zeryts.design.state;

/**
 * @author zeryts
 * @description: 已审批状态
 * -----------------------------------
 * @title: FinishedState
 * @projectName test-jvm
 * @date 2021/3/11 6:27
 */
public class FinishedState implements State{
    @Override
    public void execute() {
        System.out.println("执行已完成逻辑");
    }
}
