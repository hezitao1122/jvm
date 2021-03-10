package com.zeryts.design.mediator;

/**
 * @author zeryts
 * @description: 模块C
 * -----------------------------------
 * @title: ModelC
 * @projectName test-jvm
 * @date 2021/3/10 20:19
 */
public class ModelC implements Model {

    private Mediator mediator;
    public ModelC(Mediator mediator){
        this.mediator = mediator;
        this.mediator.setModelC(this);
    }

    @Override
    public void excute(String msg) {
        System.out.println(msg);
    }
}
