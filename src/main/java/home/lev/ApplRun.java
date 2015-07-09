package home.lev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplRun {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        ClassWithStringArg classWithStringArg=applicationContext.getBean("ClassWithStringArg", ClassWithStringArg.class);
        System.out.println(classWithStringArg.getFirst());
    }

}
