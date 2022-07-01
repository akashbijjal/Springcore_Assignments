package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	
	
	ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
	question q=context.getBean("question",question.class);
	q.question();
	
	question01 q1=context.getBean("question01",question01.class);
	q1.question01();
	
	question03 q2=context.getBean("question03",question03.class);
	q2.question03();
	
}
}
