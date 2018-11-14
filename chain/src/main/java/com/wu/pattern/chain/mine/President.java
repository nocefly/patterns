package com.wu.pattern.chain.mine;

/**
 * @Title: Approver
 * @Package: com.wu.pattern.chain.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/11
 * @Version: V1.0
 */
public class President extends Approver{

    public President(String name, Approver successor) {
        super(name, successor);
    }

    public void handler(PurchaseRequest request){
        System.out.println("President "+getName()+" process:" + request.toString());
    }
}
