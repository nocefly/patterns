package com.wu.pattern.mine;

/**
 * @Title: Memento
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
class Memento {
    private int x;
    private int y;
    private String label;

    public Memento(Chessman chessman) {
        this.x = chessman.getX();
        this.y = chessman.getY();
        this.label = chessman.getLabel();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }
}
