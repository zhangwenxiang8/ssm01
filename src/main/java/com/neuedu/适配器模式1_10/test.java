package com.neuedu.适配器模式1_10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test  {
    public static void main(String[] args) {
       final Cont cont=new TWO();
       Cont i =(Cont) Proxy.newProxyInstance(cont.getClass().getClassLoader(), cont.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("宣传");
                method.invoke(cont,args);
                System.out.println("分析");
                return null;
            }

        });
       i.sale();
    }
}
