package com.wu.pattern.flyweight.mine;

/**
 * @Title: Chessman
 * @Package: com.wu.pattern.flyweight.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/11
 * @Version: V1.0
 */
public abstract class Chessman {

    public abstract String getColor();

    public void display(){
        System.out.println("chess color:"+getColor());
    }

}
