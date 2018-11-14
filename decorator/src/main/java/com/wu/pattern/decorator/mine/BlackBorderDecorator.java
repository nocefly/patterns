package com.wu.pattern.decorator.mine;

/**
 * @Title: Decorator
 * @Package: com.wu.pattern.decorator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class BlackBorderDecorator extends Decorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display(){
        setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){
        System.out.println("create black border.");
    }
}
