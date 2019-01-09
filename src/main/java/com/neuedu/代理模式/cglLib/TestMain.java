package com.neuedu.代理模式.cglLib;


import org.springframework.cglib.proxy.Enhancer;

public class TestMain {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(CgTest.class);   //调用父类
       enhancer.setCallback(new AgentTest());   //增强关系(方法调用过来)
        CgTest s=(CgTest) enhancer.create();        //将父类与方法创建 连接关系
        System.out.println(s.namefun());            //打印父类中的方法
    }
}
