package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:autowireannotationConfig.xml");

        //Employee.class will TypeCast this to employee;
        Employee employee = applicationContext.getBean("kamlesh", Employee.class);
        System.out.println(employee);

        Employer employer = applicationContext.getBean("deepti",Employer.class);
        System.out.println(employer);
    }
}
