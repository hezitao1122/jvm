package com.zeryts.design.decorator;

/**
 * @author zeryts
 * @description: 增强的类
 * -----------------------------------
 * @title: Decorator
 * @projectName test-jvm
 * @date 2021/3/11 7:15
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void execute() {
        System.out.println("先执行增强!");
        component.execute();
        System.out.println("执行完成后,再执行增强!");
    }
}
