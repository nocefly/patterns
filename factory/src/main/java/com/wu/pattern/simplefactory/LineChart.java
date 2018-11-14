package com.wu.pattern.simplefactory;

/**
 * @Title: LineChart
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class LineChart extends Chart{

    public LineChart() {
    }

    @Override
    public void display() {
        System.out.println("LineChart display.");
    }
}
