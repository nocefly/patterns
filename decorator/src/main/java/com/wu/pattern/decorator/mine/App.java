package com.wu.pattern.decorator.mine;

/**
 * @Title: App
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){
        ScrollBarDecorator scrollBarDecorator = new ScrollBarDecorator(new Window());
        scrollBarDecorator.display();

        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(scrollBarDecorator);
        blackBorderDecorator.display();
    }
}
