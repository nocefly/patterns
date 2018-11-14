package com.wu.proxy;

/**
 * @Title: Lock
 * @Package: com.wu.pattern
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/22
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){
        MapperProxy proxy = new MapperProxy();
        Mapper mapper = new Mapper();
        MapperInterface mapperProxy = (MapperInterface)proxy.bind(mapper);

        mapperProxy.select();

        MapperProxy proxy1 = new MapperProxy();
        mapperProxy = (MapperInterface)proxy1.bind(mapperProxy);

        mapperProxy.select();
    }

}
