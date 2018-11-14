package com.wu.pattern.decorator.mine;

/**
 * @Title: Decorator
 * @Package: com.wu.pattern.decorator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class ScrollBarDecorator extends Decorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display(){
        setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("create scroll bar.");
    }
}
