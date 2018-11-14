package com.wu.pattern.singleton;

/**
 * @Title: EagerSingleton
 * @Package: com.wu.pattern.singleton
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton("one");

    private String name;

    private EagerSingleton(String name){
        this.name = name;
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public String getName(){return this.name;}

}
