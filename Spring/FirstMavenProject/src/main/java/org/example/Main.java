package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:Config.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:Config.xml");

        Student student1 = (Student) applicationContext.getBean("student1");
        Student student2 = (Student) applicationContext.getBean("student2");
        Student student3 = (Student) applicationContext.getBean("student3");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}