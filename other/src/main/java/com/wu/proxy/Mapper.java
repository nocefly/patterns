package com.wu.proxy;

/**
 * @Title: Mapper
 * @Package: com.wu.proxy
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/9/12
 * @Version: V1.0
 */
public class Mapper implements MapperInterface{

    @Override
    public void select() {
        System.out.println("select in mapper");
    }
}
