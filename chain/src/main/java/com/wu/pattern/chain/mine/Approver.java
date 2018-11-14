package com.wu.pattern.chain.mine;

/**
 * @Title: Approver
 * @Package: com.wu.pattern.chain.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/11
 * @Version: V1.0
 */
public abstract class Approver {
    private String name;
    private Approver successor;

    public Approver(String name, Approver successor) {
        this.name = name;
        this.successor = successor;
    }

    public String getName() {
        return name;
    }

    public Approver getSuccessor() {
        return successor;
    }

    public abstract void handler(PurchaseRequest request);
}
