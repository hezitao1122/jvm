package com.zeryts.design.bridges;

/**
 * @author zeryts
 * @description:
 * -----------------------------------
 * @title: ConcreateImplementor
 * @projectName test-jvm
 * @date 2021/3/11 7:39
 */
public class ConcreateImplementor implements Implementor {
    @Override
    public void execute() {
        System.out.println("execute");
    }
}
