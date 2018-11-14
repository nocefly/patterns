package com.wu.pattern.mine;

/**
 * @Title: StudentDiscount
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class VipDiscount extends Discount {
    @Override
    public double discount(double price) {
        double discount = price*0.5;
        System.out.println("vip get 50% off and point added, price is " + discount);
        return discount;
    }
}
