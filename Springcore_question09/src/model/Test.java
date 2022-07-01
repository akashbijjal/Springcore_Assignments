package model;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();

        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
        beanLifeCycle.display();
    }
}

