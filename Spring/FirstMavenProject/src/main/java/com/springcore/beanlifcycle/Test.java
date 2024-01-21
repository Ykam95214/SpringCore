package com.springcore.beanlifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ConfigurableApplicationContext  abstractApplicationContext = new ClassPathXmlApplicationContext("classpath*:beanlifcycleConfig.xml");

        //for calling destroy method we need to register ShutDown hook. and this is present in AbstractApplicationContext
        abstractApplicationContext.registerShutdownHook();

        //Bank bank = (Bank) abstractApplicationContext.getBean("HDFC");

        Bank bank = (Bank) abstractApplicationContext.getBean("SBI");
        System.out.println(bank.getAccountNumber());

    }
}
