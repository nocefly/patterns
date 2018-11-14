package com.wu.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @Title: Viewer
 * @Package: com.wu.pattern.observer.java
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/5
 * @Version: V1.0
 */
public class Viewer implements Observer {
    private int seatNo;

    public Viewer(int seatNo) {
        this.seatNo = seatNo;
    }

    @Override
    public void update(Observable o, Object arg) {
        PerformType randomType = (PerformType)arg;
        if(PerformType.PERFORM_GOOD.equals(randomType))
            applause();
        else if(PerformType.PERFORM_BAD.equals(randomType))
            cheerBack();
        else
            exit();
    }

    /**
     * 鼓掌
     */
    private void applause() {
        System.out.println("Seat No " + seatNo + " applause！");
    }

    /**
     * 倒喝彩
     */
    private void cheerBack() {
        System.out.println("Seat No " + seatNo + " cheer back！");
    }

    /**
     * 退场
     */
    private void exit() {
        System.out.println("Seat No " + seatNo + " exit！");
    }
}
