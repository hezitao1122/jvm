package com.zeryts.design.state;

/**
 * @author zeryts
 * @description: 已审批状态
 * -----------------------------------
 * @title: AlreadyState
 * @projectName test-jvm
 * @date 2021/3/11 6:28
 */
public class AlreadyState implements State{
    @Override
    public void execute() {
        System.out.println("执行已审批逻辑");
    }
}
