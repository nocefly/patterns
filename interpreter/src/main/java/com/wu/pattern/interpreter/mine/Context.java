package com.wu.pattern.interpreter.mine;

import java.util.StringTokenizer;

/**
 * @Title: Context
 * @Package: com.wu.pattern.interpreter.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/13
 * @Version: V1.0
 */
public class Context {
    private String currentToken; //当前字符串标记
    private StringTokenizer stringTokenizer;

    public Context(String text){
        stringTokenizer = new StringTokenizer(text);

    }



}
