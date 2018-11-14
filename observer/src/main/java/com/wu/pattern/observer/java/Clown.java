package com.wu.pattern.observer.java;
import java.util.Observable;
import java.util.Random;

/**
 * @Title: Clown
 * @Package: com.wu.pattern.observer.java
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/30
 * @Version: V1.0
 */
public class Clown extends Observable {

    public void perform(){
        System.out.println("the clown begins to perform.");
        int random = new Random().nextInt(2);
        setChanged();
        if(random==0){
            System.out.println("the clown performs good.");
            notifyObservers(PerformType.PERFORM_GOOD);
        }
        else{
            System.out.println("the clown performs badly.");
            notifyObservers(PerformType.PERFORM_BAD);
        }
    }

    public void finished(){
        System.out.println("the clown is ends to perform.");
        setChanged();
        notifyObservers(PerformType.PERFORM_COMPLETE);
    }

}
