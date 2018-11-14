package com.wu.pattern.composite.mine;

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
        Container container = new Container();
        Container subContainer = new Container();
        subContainer.add(new Leaf());
        subContainer.add(new Leaf());
        container.add(new Leaf());
        container.add(new Leaf());
        container.add(subContainer);

        container.operation();

    }
}
