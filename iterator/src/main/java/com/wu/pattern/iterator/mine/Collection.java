package com.wu.pattern.iterator.mine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Collection
 * @Package: com.wu.pattern.iterator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/24
 * @Version: V1.0
 */
public abstract class Collection {
    private List<Object> collection = new ArrayList<>();
    public abstract Iterator iterator();

    public void add(Object obj){
        collection.add(obj);
    }

    public void remove(Object obj){
        collection.remove(obj);
    }

    public List<Object> getAll(){
        return collection;
    }

}
