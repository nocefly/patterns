package com.wu.pattern.chain.mine;

/**
 * @Title: PurchaseRequest
 * @Package: com.wu.pattern.chain.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/11
 * @Version: V1.0
 */
public class PurchaseRequest {
    private double amount;  //采购金额
    private int number;  //采购单编号
    private String purpose;  //采购目的

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "PurchaseRequest{" +
                "amount=" + amount +
                ", number=" + number +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
