package com.wu.pattern.observer.java;

import com.wu.pattern.observer.mine.AllyCenter;
import com.wu.pattern.observer.mine.ConcreteAllyCenter;
import com.wu.pattern.observer.mine.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Clown clown = new Clown();
        Viewer viewer1 = new Viewer(1);
        Viewer viewer2 = new Viewer(2);
        Viewer viewer3 = new Viewer(3);

        clown.addObserver(viewer1);
        clown.addObserver(viewer2);
        clown.addObserver(viewer3);

        clown.perform();
        clown.finished();

    }
}
