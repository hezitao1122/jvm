package com.zeryts.design.chain;

/**
 * @author zeryts
 * @description: 职责链的抽象
 * -----------------------------------
 * @title: Handler
 * @projectName test-jvm
 * @date 2021/3/11 7:27
 */
public abstract class Handler {
    /**
     * 后继者
     */
    protected Handler succesor ;

    public Handler(Handler handler){
        this.succesor = handler;
    }

    abstract void execute();
}
