package com.wu.pattern;

import java.util.WeakHashMap;

/**
 * @Title: reference
 * @Package: com.wu.pattern
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/21
 * @Version: V1.0
 */
public class reference {

    public static void main(String[] args){
        WeakHashMap<Integer,String> weakHashMap = new WeakHashMap<>();
        Integer zero = new Integer(0);
        weakHashMap.put(zero,"zero");
        weakHashMap.put(new Integer(1),"one");
        weakHashMap.put(new Integer(2),"two");
        System.out.println(weakHashMap.toString());
        System.gc();
        System.out.println(weakHashMap.toString());
    }

}
