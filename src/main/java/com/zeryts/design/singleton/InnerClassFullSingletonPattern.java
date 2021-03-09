package com.zeryts.design.singleton;

/**
 * @author zeryts
 * @description: 基于内部类实现的饱汉模式单例
 * 内部类: 只要没有被使用,就不会被初始化
 * 在第一次使用的时候,内部类会被初始化,会创建一个Singleton的实例
 *
 * java能确保一点的是,静态内部类初始化的时候,只会被执行一次
 * -----------------------------------
 * @title: InnerClassFullSingletonPattern
 * @projectName test-jvm
 * @date 2021/3/10 7:24
 */
public class InnerClassFullSingletonPattern {




    public static class Singleton{
        private Singleton(){

        }

        public void excute(){
            System.out.println("执行");
        }

        public static class InnerHolder{
            public static final Singleton instance = new Singleton();

            public static Singleton getInstance(){
                return InnerHolder.instance;
            }
        }
    }
}
