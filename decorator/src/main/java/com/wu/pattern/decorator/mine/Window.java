package com.wu.pattern.decorator.mine;

/**
 * @Title: Window
 * @Package: com.wu.pattern.decorator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Window implements Component{

    @Override
    public void display() {
        System.out.println("display window.");
    }
}
