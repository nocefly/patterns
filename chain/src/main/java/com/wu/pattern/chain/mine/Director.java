package com.wu.pattern.chain.mine;

/**
 * @Title: Approver
 * @Package: com.wu.pattern.chain.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/11
 * @Version: V1.0
 */
public class Director extends Approver{

    public Director(String name, Approver successor) {
        super(name, successor);
    }

    public void handler(PurchaseRequest request){
        if(request.getAmount()<50000){
            System.out.println("Director "+getName()+" process:" + request.toString());
        }
        else
            getSuccessor().handler(request);
    }
}
