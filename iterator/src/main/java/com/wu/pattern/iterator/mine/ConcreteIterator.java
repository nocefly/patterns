package com.wu.pattern.iterator.mine;

/**
 * @Title: ConcreteIterator
 * @Package: com.wu.pattern.iterator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/24
 * @Version: V1.0
 */
public class ConcreteIterator implements Iterator {
    private ConcreteCollection concreteCollection;
    private int cursor1;
    private int cursor2;
    private final int size;

    public ConcreteIterator(ConcreteCollection concreteCollection) {
        this.concreteCollection = concreteCollection;
        size = concreteCollection.getAll().size();
        cursor1 = 0;
        cursor2 = size-1;
    }


    @Override
    public boolean isFirst() {
        return cursor2==-1;
    }

    @Override
    public boolean isLast() {
        return cursor1==size;
    }

    @Override
    public void next() {
        if(cursor1<size)
            cursor1++;
    }

    @Override
    public void previous() {
        if(cursor2>-1)
            cursor2--;
    }

    @Override
    public Object getNext() {
        return concreteCollection.getAll().get(cursor1);
    }

    @Override
    public Object getPrevious() {
        return concreteCollection.getAll().get(cursor2);
    }
}
