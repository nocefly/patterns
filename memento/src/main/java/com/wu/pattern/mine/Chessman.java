package com.wu.pattern.mine;

/**
 * @Title: Chessman
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class Chessman {
    private int x;
    private int y;
    private String label;

    public Chessman(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public Memento save(){
        return new Memento(this);
    }

    public void restore(Memento memento){
        this.x = memento.getX();
        this.y = memento.getY();
        this.label = memento.getLabel();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Chessman{" +
                "x=" + x +
                ", y=" + y +
                ", label='" + label + '\'' +
                '}';
    }
}
