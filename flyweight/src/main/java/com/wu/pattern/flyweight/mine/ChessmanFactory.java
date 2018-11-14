package com.wu.pattern.flyweight.mine;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: Chessman
 * @Package: com.wu.pattern.flyweight.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/11
 * @Version: V1.0
 */
public class ChessmanFactory {

    private ChessmanFactory(){
        ht.put("w",new WhiteChessman());
        ht.put("b",new BlackChessman());
    }

    public static ChessmanFactory getInstance(){
        return IoDH.instance;
    }

    private static class IoDH{
        public final static ChessmanFactory instance = new ChessmanFactory();
    }


    private Map<String,Chessman> ht = new HashMap<>();

    public Chessman getChessman(String color){
        return ht.get(color);
    }

}
