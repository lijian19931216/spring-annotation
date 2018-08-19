package com.luying.proxy;

import org.junit.Test;

public class TankTest {

    @Test
    public void move() {
        Moveable tank=new Tank();
        Moveable tankLog=new TankLogProxy(tank);
        Moveable tankTime=new TankTimeProxy(tankLog);
        tankTime.move();
    }

    @Test
    public void nameTest() {
        System.out.println(System.getProperty("user.dir"));
    }
}