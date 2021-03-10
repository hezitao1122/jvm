package com.zeryts.design.mediator;

/**
 * @author zeryts
 * @description: 模块A
 * -----------------------------------
 * @title: ModelA
 * @projectName test-jvm
 * @date 2021/3/10 20:19
 */
public class ModelA implements Model {

    private Mediator mediator;
    public ModelA(Mediator mediator){
        this.mediator = mediator;
        this.mediator.setModelA(this);
    }


    @Override
    public void excute(String msg) {
        System.out.println(msg);
    }
}
