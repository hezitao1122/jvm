package com.zeryts.design.mediator;

/**
 * @author zeryts
 * @description: 中介者的测试类
 *
 * 实际运用中为 : 接口之间的调用采用MQ进行调用
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 20:31
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();


        ModelA a = new ModelA(mediator);
        ModelB b = new ModelB(mediator);
        ModelC c = new ModelC(mediator);


        mediator.excuteModelA();
        mediator.excuteModelB();
        mediator.excuteModelC();
    }
}
