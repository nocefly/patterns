package com.wu.pattern.decorator.mine;

/**
 * @Title: Decorator
 * @Package: com.wu.pattern.decorator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void display(){
        component.display();
    }
}
