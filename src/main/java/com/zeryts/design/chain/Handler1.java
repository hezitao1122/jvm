package com.zeryts.design.chain;

/**
 * @author zeryts
 * @description: 功能
 * -----------------------------------
 * @title: Handler1
 * @projectName test-jvm
 * @date 2021/3/11 7:28
 */
public class Handler1 extends Handler {
    public Handler1(Handler handler) {
        super(handler);
    }

    @Override
    public void execute() {
        System.out.println("执行功能1");
        if(succesor != null){
            succesor.execute();
        }
    }
}
