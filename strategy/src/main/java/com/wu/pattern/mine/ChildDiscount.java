package com.wu.pattern.mine;

/**
 * @Title: StudentDiscount
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class ChildDiscount extends Discount {
    @Override
    public double discount(double price) {
        double discount = price>=20?(price-10):price;
        System.out.println("child get 10 yuan off if age is more than 10, price is " + discount);
        return discount;
    }
}
