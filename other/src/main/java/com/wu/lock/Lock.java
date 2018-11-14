package com.wu.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Title: Lock
 * @Package: com.wu.pattern
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/22
 * @Version: V1.0
 */
public class Lock {
    public class Locker{
        private boolean isLocked = false;
        private Thread currentThread = null;
        private int lockCount = 0;

        public synchronized void lock(){
            while(isLocked&&currentThread!=Thread.currentThread()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isLocked = true;
            lockCount++;
            currentThread = Thread.currentThread();
        }

        public synchronized void unlock(){
            if(currentThread==Thread.currentThread())
                lockCount--;

            if(lockCount==0){
                isLocked = false;
                currentThread = null;
                notify();
            }
        }
    }


    private Locker locker = new Locker();

    public void outer(){
        locker.lock();
        inner();
        locker.unlock();
    }
    public void inner(){
        locker.lock();
        System.out.println("do something inner.");
        locker.unlock();
    }

    public static void main(String[] args){
        Lock lock = new Lock();
        lock.outer();
    }


}
