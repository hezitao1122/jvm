package com.zeryts.design.staticproxy;

/**
 * @author zeryts
 * @description: 测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 21:09
 */
public class Test {

    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();

        Proxy proxy = new Proxy(subject);

        proxy.request();
    }

}
