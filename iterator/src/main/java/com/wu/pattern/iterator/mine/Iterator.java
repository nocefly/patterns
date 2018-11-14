package com.wu.pattern.iterator.mine;

/**
 * @Title: Iterator
 * @Package: com.wu.pattern.iterator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/24
 * @Version: V1.0
 */
public interface Iterator {
    public boolean isFirst();
    public boolean isLast();
    public void next();
    public void previous();
    public Object getNext();
    public Object getPrevious();
}
