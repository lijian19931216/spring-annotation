package com.luying.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @description:
 * @author: lijian
 * @create: 2018-08-18
 **/
@Aspect
@Component
public class MyLogAspect {
    @Pointcut("execution(* com.luying.aop.MyCalculator.*(..))")
    public void myCutPoint(){

    }
    @Before("myCutPoint()")
    public void logStart(JoinPoint jp){//JoinPoint 一定出现在第一位
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("除法开始,方法名:"+methodName+",参数："+Arrays.toString(args));
    }
    @After("myCutPoint()")
    public void logEnd(){
        System.out.println("除法结束after");
    }
    @AfterReturning(value = "myCutPoint()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法返回afterreturning"+result);
    }
    @AfterThrowing(value = "myCutPoint()",throwing = "e")
    public void logException(Exception e){
        System.out.println("除法异常"+e.getMessage());
    }
}
