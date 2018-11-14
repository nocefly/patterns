package com.wu.bridge;

/**
 * @Title: MyImpl
 * @Package: com.wu.bridge
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/9
 * @Version: V1.0
 */
public class MyImpl implements MyInterface{

    public void say(String arg){
        System.out.println("call string param method." + arg);
    }

    @Override
    public void say(Object arg) {
        System.out.println("call object param method." + arg);
    }
}
