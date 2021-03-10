package com.zeryts.design.bridges;

/**
 * @author zeryts
 * @description: 抽象
 * -----------------------------------
 * @title: Abstraction
 * @projectName test-jvm
 * @date 2021/3/11 7:40
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract void execute();

}
