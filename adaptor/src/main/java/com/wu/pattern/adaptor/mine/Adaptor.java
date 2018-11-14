package com.wu.pattern.adaptor.mine;

/**
 * @Title: Adaptor
 * @Package: com.wu.pattern.adaptor.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Adaptor implements ScoreOperationTarget{
    private FindAdaptee findAdaptee;
    private SortAdaptee sortAdaptee;

    public Adaptor(FindAdaptee findAdaptee, SortAdaptee sortAdaptee) {
        this.findAdaptee = findAdaptee;
        this.sortAdaptee = sortAdaptee;
    }

    @Override
    public void sort() {
        sortAdaptee.sort();
    }

    @Override
    public void find() {
        findAdaptee.find();
    }
}
