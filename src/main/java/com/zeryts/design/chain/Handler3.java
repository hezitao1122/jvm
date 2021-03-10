package com.zeryts.design.chain;

/**
 * @author zeryts
 * @description: 功能
 * -----------------------------------
 * @title: Handler3
 * @projectName test-jvm
 * @date 2021/3/11 7:28
 */
public class Handler3 extends   Handler {

    public Handler3(Handler handler) {
        super(handler);
    }

    @Override
    public void execute() {
        System.out.println("执行功能3");
        if(succesor != null){
            succesor.execute();
        }
    }
}
