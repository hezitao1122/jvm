package com.zeryts.design.flyweight;

/**
 * @author zeryts
 * @description: TODO
 * -----------------------------------
 * @title: ConcreateFlyweight
 * @projectName test-jvm
 * @date 2021/3/11 7:05
 */
public class ConcreateFlyweight implements Flyweight{

    private String name;
    public ConcreateFlyweight(String name){
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("成功执行逻辑");
    }
}
