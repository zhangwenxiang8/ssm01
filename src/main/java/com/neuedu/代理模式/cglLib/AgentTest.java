package com.neuedu.代理模式.cglLib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AgentTest implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        String strs =(String) methodProxy.invokeSuper(o,args);
        /*调用methodProxy里的invokeSuper方法,反射获取父层的方法参数*/
        return strs.toUpperCase();
    }
}
