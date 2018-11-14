package com.wu.pattern.simplefactory;

/**
 * @Title: ChartFactory
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class ChartFactory {

    public static Chart createChart(String type){
        if(type.equals("PieChart")){
            return new PieChart();
        }
        else if(type.equals("LineChart"))
            return new LineChart();
        else
            throw  new IllegalArgumentException("no type be found.");

    }
}
