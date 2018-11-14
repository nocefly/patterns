package com.wu.pattern.abstractfactory;

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
        AbstractFactory chartFactory = new SpringFactory();
        chartFactory.CreateButton().display();
        chartFactory.CreateComboBox().display();
        chartFactory.CreateTextField().display();

        chartFactory = new SummerFactory();
        chartFactory.CreateButton().display();
        chartFactory.CreateComboBox().display();
        chartFactory.CreateTextField().display();
    }
}
