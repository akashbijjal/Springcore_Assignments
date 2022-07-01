package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        dbconfiguration dbConfiguration = context.getBean(dbconfiguration.class);
        dbConfiguration.display();
    }

}
