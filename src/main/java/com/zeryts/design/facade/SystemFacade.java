package com.zeryts.design.facade;

/**
 * @author zeryts
 * @description: 门面类
 * -----------------------------------
 * @title: SystemFacade
 * @projectName test-jvm
 * @date 2021/3/10 7:49
 */
public class SystemFacade {

    public void execute(){
        Model modelA = new ModelA();
        Model modelB = new ModelB();
        modelA.exrxute();
        modelB.exrxute();
    }

}
