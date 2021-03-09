package com.zeryts.design.singleton;

/**
 * @author zeryts
 * @description: 饱汉模式
 * -----------------------------------
 * @title: HungrySingletonPattern
 * @projectName test-jvm
 * @date 2021/3/10 7:10
 */
public class HungrySingletonPattern {

    private static final Singleton install = new Singleton();
    /** description: 获取实例
     * @return: com.zeryts.design.singleton.HungrySingletonPattern.Singleton
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 7:12
     */
    public static Singleton getInstall(){
        return install;
    }

    public static class Singleton{
        /**
         * 私有化构造,不让人new
         */
        private Singleton(){}

        public void excute(){
            System.out.println("执行!");
        }
    }
}
