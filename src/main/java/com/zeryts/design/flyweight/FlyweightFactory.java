package com.zeryts.design.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zeryts
 * @description: 享元模式工厂类
 * -----------------------------------
 * @title: FlyweightFactory
 * @projectName test-jvm
 * @date 2021/3/11 7:07
 */
public class FlyweightFactory {

    private static final Map<String, Flyweight> cacheMap = new ConcurrentHashMap<String, Flyweight>();

    public static Flyweight get(String name) {
        Flyweight f = cacheMap.get(name);
        if (f == null) {
            f = new ConcreateFlyweight(name);
            cacheMap.put(name, f);
        }
        return cacheMap.get(f);
    }

}
