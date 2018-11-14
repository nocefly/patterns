package com.wu.pattern.factory;

/**
 * @Title: ChartFactory
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class LineChartFactory implements ChartFactory{
    public Chart createChart() {
        return new LineChart();
    }
}
