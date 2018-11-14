package com.wu.pattern.singleton;

/**
 * @Title: EagerSingleton
 * @Package: com.wu.pattern.singleton
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class LazySingleton {
    private volatile static LazySingleton instance = null;

    private String name;

    private LazySingleton(String name){
        this.name = name;
    }

    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                if(instance==null)
                    instance = new LazySingleton("one");
            }
        }
        return instance;
    }

    public String getName(){return this.name;}

}
