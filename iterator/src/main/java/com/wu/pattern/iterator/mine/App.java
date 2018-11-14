package com.wu.pattern.iterator.mine;

/**
 * @Title: App
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){

        Collection collection = new ConcreteCollection();
        collection.add("first");
        collection.add("second");
        collection.add("third");
        collection.add("forth");

        Iterator iterator = collection.iterator();

        while(iterator.isLast()==false){
            System.out.println(iterator.getNext());
            iterator.next();
        }

        while(iterator.isFirst()==false){
            System.out.println(iterator.getPrevious());
            iterator.previous();
        }

    }
}
