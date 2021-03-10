package com.zeryts.design.mediator;

/**
 * @author zeryts
 * @description: 中介者类 , 会持有所有模块的引用
 * -----------------------------------
 * @title: Mediator
 * @projectName test-jvm
 * @date 2021/3/10 20:23
 */
public class Mediator {

    private Model modelA;
    private Model modelB;
    private Model modelC;

    public Model getModelA() {
        return modelA;
    }

    public void setModelA(Model modelA) {
        this.modelA = modelA;
    }

    public Model getModelB() {
        return modelB;
    }

    public void setModelB(Model modelB) {
        this.modelB = modelB;
    }

    public Model getModelC() {
        return modelC;
    }

    public void setModelC(Model modelC) {
        this.modelC = modelC;
    }

    public void excuteModelA(){
        modelB.excute("模块A通知中介者执行ModelB");
        modelB.excute("模块A通知中介者执行Modelc");


    }
    public void excuteModelB(){
        modelB.excute("模块B通知中介者执行ModelA");
        modelB.excute("模块B通知中介者执行Modelc");
    }
    public void excuteModelC(){
        modelB.excute("模块C通知中介者执行ModelA");
        modelB.excute("模块C通知中介者执行ModelB");
    }
}
