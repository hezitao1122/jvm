package com.zeryts.design.bridges;

/**
 * @author zeryts
 * @description: 组件
 * -----------------------------------
 * @title: RefinedAbstraction
 * @projectName test-jvm
 * @date 2021/3/11 7:42
 */
public class RefinedAbstraction extends Abstraction {


    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void execute() {
        System.out.println("实现了");
        implementor.execute();
    }
}
