package com.luying.proxy;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
public class TankLogProxy implements Moveable {
    Moveable m;

    public TankLogProxy(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("log start");
        m.move();
        System.out.println("log end");
    }
}
