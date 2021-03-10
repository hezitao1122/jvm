package com.zeryts.design.staticproxy;

/**
 * @author zeryts
 * @description: 代理类
 * -----------------------------------
 * @title: Proxy
 * @projectName test-jvm
 * @date 2021/3/10 20:55
 */
public class Proxy implements Subject{
    private ConcreateSubject concreateSubject;

    public Proxy(ConcreateSubject concreateSubject){
        this.concreateSubject = concreateSubject;
    }

    @Override
    public void request() {
        System.out.println("执行以下代理逻辑");
        concreateSubject.request();
    }
}
