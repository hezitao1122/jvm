package com.zeryts.design.mediator;

/**
 * @author zeryts
 * @description: 模块A
 * -----------------------------------
 * @title: ModelA
 * @projectName test-jvm
 * @date 2021/3/10 20:19
 */
public class ModelB implements Model {
    private Mediator mediator;

    public ModelB(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelB( this);
    }


    @Override
    public void excute(String msg) {
        System.out.println(msg);
    }
}
