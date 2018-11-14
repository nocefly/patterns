package com.wu.pattern.simplefactory;

/**
 * @Title: PieChart
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class PieChart extends Chart{

    public PieChart() {
    }

    @Override
    public void display() {
        System.out.println("PieChart display.");
    }
}
