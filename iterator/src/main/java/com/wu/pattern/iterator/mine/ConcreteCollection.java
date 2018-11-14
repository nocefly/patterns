package com.wu.pattern.iterator.mine;

/**
 * @Title: ConcreteCollection
 * @Package: com.wu.pattern.iterator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/24
 * @Version: V1.0
 */
public class ConcreteCollection extends Collection{

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
