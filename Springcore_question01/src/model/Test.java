package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//Address add=context.getBean("address",Address.class);
//add.go();

customer cus=context.getBean(customer.class);
cus.abc();
}
}
