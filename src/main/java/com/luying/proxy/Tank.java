package com.luying.proxy;

import java.util.Random;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
public class Tank implements Moveable{
    @Override
    public void move() {
//        long start=System.currentTimeMillis();
        System.out.println("tank moving ....");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long end=System.currentTimeMillis();
//        System.out.println("time:"+(end-start));
    }


}
