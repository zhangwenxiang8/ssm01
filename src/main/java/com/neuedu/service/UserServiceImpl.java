package com.neuedu.service;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IuserService {
 /*其实在启动spring IoC时，容器自动装载了一个AutowiredAnnotationBeanPostProcessor后置处理器，
 当容器扫描到@Autowied、@Resource或@Inject时，
 就会在IoC容器自动查找需要的bean，并装配给该对象的属性*/

 /*@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，
 完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法。*/
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> Listss() {
        return userDao.Lists();
    }

    @Override
    public void doSome() {
        System.out.println("执行dosome方法");
    }
}
