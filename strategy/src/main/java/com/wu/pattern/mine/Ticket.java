package com.wu.pattern.mine;

/**
 * @Title: Ticket
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class Ticket {
    private Discount discount;
    private double price;

    public Ticket(Discount discount, double price) {
        this.discount = discount;
        this.price = price;
    }

    public double getPrice(){
        return discount.discount(price);
    }

}
