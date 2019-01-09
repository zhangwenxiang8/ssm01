package com.neuedu.代理模式.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
      final   jdk动态代理 j=new Iml动态代理();
       jdk动态代理 prot=(jdk动态代理) Proxy.newProxyInstance(j.getClass().getClassLoader(), j.getClass().getInterfaces(), new InvocationHandler() {
           @Override
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String strs="";
            if (method.getName().equals("getStr")){
                 strs =(String) method.invoke(j,args);
                return strs.toUpperCase();
            }


              /* method , invoke (对象,参数)*/
             /* invoke 利用反射获取类中的方法,类型,参数,封装成一个对象;
             args对象数组，代表被调用方法的参数。*/
              //返回的对象+方法
               return strs;
           }
       });
                    /*getClassLoader(),反射技术,对象是动态生成的,不知道是哪个类,所以在类加载时用类加载器去获取*/
                    /*getInterfaces  获取它的接口  */
        System.out.println(prot.getStr());

        System.out.println(prot.domost());

    }
}
