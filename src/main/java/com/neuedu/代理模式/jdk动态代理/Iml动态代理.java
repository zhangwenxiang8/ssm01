package com.neuedu.代理模式.jdk动态代理;

/*要被增强的对象   ---   目标对象*/
public class Iml动态代理 implements jdk动态代理 {
    @Override
    public String getStr() {
        /*返回值为大写形式*/
        return "abcd";
    }

    @Override
    public String domost() {
        return "ddhd";
    }
}
