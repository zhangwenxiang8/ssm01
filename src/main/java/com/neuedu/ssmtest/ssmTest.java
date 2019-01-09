package com.neuedu.ssmtest;

import com.neuedu.pojo.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



public class ssmTest {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Dept dept=(Dept)ac.getBean("dept");
        System.out.println(dept);
    }
}
