package com.wu.pattern.singleton;

/**
 * @Title: App
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.getName());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.getName());

        IoDHSingleton ioDHSingleton = IoDHSingleton.getInstance();
        System.out.println(ioDHSingleton.getName());

    }
}
