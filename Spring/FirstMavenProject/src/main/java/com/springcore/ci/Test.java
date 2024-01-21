package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:ciConfig.xml");

        /*Person person = (Person) applicationContext.getBean("person2");
        System.out.println(person.toString());*/


        Addition addition = (Addition) applicationContext.getBean("sum2");

        addition.doSum();
    }
}
