package org.example.injectreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:refConfig.xml");
        A a = (A) applicationContext.getBean("aref");

        System.out.println(a.getName());
        System.out.println(a.getb().getName());
    }
}
