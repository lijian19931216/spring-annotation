package com.luying.aop;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
@Component
public class MyCalculator {
    public int mydiv(int a,int b){
        return a/b;
    }
}
