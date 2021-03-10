package com.zeryts.design.chain;

/**
 * @author zeryts
 * @description: 职责链模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 7:31
 */
public class Test {


    public static void main(String[] args) {
        Handler handler1 = new Handler1(null);
        Handler handler2 = new Handler2(handler1);
        Handler handler3 = new Handler3(handler2);

        handler3.execute();

        Handler h2 = new Handler2(null);
        Handler h1 = new Handler1(h2);
        Handler h3 = new Handler3(h1);

        h3.execute();
    }

}
