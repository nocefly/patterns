package com.wu.pattern.singleton;

/**
 * @Title: IoDHSingleton
 * @Package: com.wu.pattern.singleton
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class IoDHSingleton {

    public static IoDHSingleton getInstance(){
        return IoDH.INSTANCE;
    }

    private static class IoDH{
        public final static IoDHSingleton INSTANCE = new IoDHSingleton("IoDHSingleton");
    }

    private String name;

    private IoDHSingleton(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
