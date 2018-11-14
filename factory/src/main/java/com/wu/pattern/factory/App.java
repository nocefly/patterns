package com.wu.pattern.factory;

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
        ChartFactory chartFactory = new LineChartFactory();
        chartFactory.createChart().display();

        chartFactory = new PieChartFactory();
        chartFactory.createChart().display();
    }
}
