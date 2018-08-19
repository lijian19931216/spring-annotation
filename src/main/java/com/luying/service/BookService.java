package com.luying.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-15
 **/
@Service
public class BookService {
    public String sayHello(String name){
        return "service : hello "+name;
    }
}
