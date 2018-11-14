package com.wu.pattern;

import java.util.concurrent.locks.Lock;

/**
 * @Title: Lock
 * @Package: com.wu.pattern
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/22
 * @Version: V1.0
 */
public class Signal {
    private class Monitor{
    }

    private Monitor monitor = new Monitor();
    private Boolean wasSignalled = false;

    public void doWait(){

        synchronized (monitor){
            if(wasSignalled){
                wasSignalled = false;
                System.out.println("notify ..");
            }
            else {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void doNotify(){
        synchronized (monitor){
            wasSignalled = true;
            monitor.notify();
            System.out.println("notify ..");
        }
    }

}
