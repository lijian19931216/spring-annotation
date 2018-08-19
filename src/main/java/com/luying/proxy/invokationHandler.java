package com.luying.proxy;

import java.lang.reflect.Method;

public interface invokationHandler {
    void invoke(Method method,Object o);
}
