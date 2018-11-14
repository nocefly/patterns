package com.wu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title: MapperProxy
 * @Package: com.wu.proxy
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/9/12
 * @Version: V1.0
 */
public class MapperProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object object){
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("in jdk dynamic method.");
        method.invoke(target,args);
        return null;
    }
}
