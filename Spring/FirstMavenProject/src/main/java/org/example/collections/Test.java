package org.example.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext collectionApplicationContext = new ClassPathXmlApplicationContext("classpath*:collectionConfig.xml");

        Employee employee = (Employee) collectionApplicationContext.getBean("Employee1");
        System.out.println(employee.getName());
    }
}
