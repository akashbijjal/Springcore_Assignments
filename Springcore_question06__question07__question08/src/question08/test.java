package question08;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("question08.xml");

        context.registerShutdownHook();

        dog dog= (dog)context.getBean("dog");
        dog.eat();

        dog dog1= (dog)context.getBean("dog1");
        dog1.eat();

        dog dog2= (dog)context.getBean("dog2");
        dog2.eat();

    }


}

