package com.wu.bridge;

/**
 * @Title: App
 * @Package: com.wu.bridge
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/9
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){
        MyImpl impl = new MyImpl();
        impl.say("hello");

        MyInterface inter = new MyImpl();
        inter.say("hello");

    }
}
