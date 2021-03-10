package com.zeryts.design.state;

/**
 * @author zeryts
 * @description: 待审批状态
 * -----------------------------------
 * @title: LoadingState
 * @projectName test-jvm
 * @date 2021/3/11 6:27
 */
public class LoadingState implements State{
    @Override
    public void execute() {
        System.out.println("执行等待审批逻辑");

    }
}
