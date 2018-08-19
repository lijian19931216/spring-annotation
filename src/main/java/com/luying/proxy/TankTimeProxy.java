package com.luying.proxy;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
public class TankTimeProxy implements Moveable{
    private Moveable tank;

    public TankTimeProxy(Moveable tank) {
        this.tank = tank;
    }
    @Override
    public void move() {
        long start=System.currentTimeMillis();
        tank.move();
        long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }
}
