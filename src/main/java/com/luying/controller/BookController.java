package com.luying.controller;

import com.luying.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-15
 **/
@Controller
public class BookController {
    @Autowired
    BookService service;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return service.sayHello("lijian999");
    }
    @RequestMapping("/success")
    public String hello1(){
        return "success";
    }
    @RequestMapping("/async")
    @ResponseBody
    public Callable<String> async(){
        System.out.println("主线程kaishi"+Thread.currentThread()+"-->"+System.currentTimeMillis());
        Callable<String> callable= new Callable<String>(){

            @Override
            public String call() throws Exception {
                System.out.println("fu线程kaishi"+Thread.currentThread()+"-->"+System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("fu线程jieshu"+Thread.currentThread()+"-->"+System.currentTimeMillis());

                return "callable async";
            }
        };
        System.out.println("主线程jieshu"+Thread.currentThread()+"-->"+System.currentTimeMillis());
        return callable;
    }

    @ResponseBody
    @RequestMapping("/deferred")
    public DeferredResult<Object> creatOrder(){
        DeferredResult<Object> def=new DeferredResult<>((long)2000, "creat fail");
        return def;
    }
}
