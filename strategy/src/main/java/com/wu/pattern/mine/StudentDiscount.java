package com.wu.pattern.mine;

/**
 * @Title: StudentDiscount
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class StudentDiscount extends Discount {

    @Override
    public double discount(double price) {
        double discount = 0.8*price;
        System.out.println("student get 20% off, price is " + discount);
        return discount;
    }
}
