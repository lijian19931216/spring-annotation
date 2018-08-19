package com.luying.proxy.jdk;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-19
 **/
public class XiaoMing implements Person {
    @Override
    public String say(String word) {
        return "小明说："+word;
    }
}
