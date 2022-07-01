package problem05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("problem5.xml");
	Employee emp=context.getBean(Employee.class);
	System.out.println("EMP ID: "+emp.getEmpid()+"\t"+"EMP Name: "+emp.getEmployeename());
	pancard pan=emp.getPan();
	System.out.println("PAN No: "+pan.getPanno()+"\t"+"PAN Name: "+pan.getPancardholdername());
}
}
