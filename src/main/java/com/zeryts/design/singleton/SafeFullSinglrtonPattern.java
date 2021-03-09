package com.zeryts.design.singleton;

/**
 * @author zeryts
 * @description: 线程不安全的饱汉模式
 * -----------------------------------
 * @title: UnsafeFullSinglrtonPattern
 * @projectName test-jvm
 * @date 2021/3/10 7:15
 */
public class SafeFullSinglrtonPattern {
    private static Singleton install = null;


    public static Singleton getInstance(){
        if(install == null ){
            synchronized (SafeFullSinglrtonPattern.class){
                if(install == null ){
                    install = new Singleton();
                }
            }
        }
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
