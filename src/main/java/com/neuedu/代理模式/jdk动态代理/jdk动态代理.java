package com.neuedu.代理模式.jdk动态代理;

//接口    --- 写业务
public interface jdk动态代理 {
    public String getStr();
    public String domost();
}


/*Java的动态代理(dynamic proxy)
什么是动态代理(dynamic proxy)
动态代理（以下称代理），利用Java的反射技术(Java Reflection)，在运行时创建一个实现某些给定接口的新类（也称“动态代理类”）及其实例（对象）

(Using Java Reflection to create dynamic implementations of interfaces at runtime)。

代理的是接口(Interfaces)，不是类(Class)，更不是抽象类。





动态代理有什么用
解决特定问题：一个接口的实现在编译时无法知道，需要在运行时才能实现

实现某些设计模式：适配器(Adapter)或修饰器(Decorator)

面向切面编程：如AOP in Spring




创建动态代理
利用Java的Proxy类，调用Proxy.newProxyInstance()，创建动态对象十分简单。
Proxy.newProxyInstance()方法有三个参数：

1. 类加载器(Class Loader)

2. 需要实现的接口数组

3. InvocationHandler接口。所有动态代理类的方法调用，都会交由InvocationHandler接口实现类里的invoke()方法去处理。这是动态代理的关键所在。


InvocationHandler接口
接口里有一个invoke()方法。基本的做法是，创建一个类，实现这个方法，利用反射在invoke()方法里实现需求：
invoke()方法同样有三个参数：

1. 动态代理类的引用，通常情况下不需要它。但可以使用getClass()方法，得到proxy的Class类从而取得实例的类信息，如方法列表，annotation等。

2. 方法对象的引用，代表被动态代理类调用的方法。从中可得到方法名，参数类型，返回类型等等

3. args对象数组，代表被调用方法的参数。注意基本类型(int,long)会被装箱成对象类型(Interger, Long)*/