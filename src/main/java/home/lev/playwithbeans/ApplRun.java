package home.lev.playwithbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class ApplRun {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        ClassWithStringArg classWithStringArg=applicationContext.getBean("ClassWithStringArg", ClassWithStringArg.class);
        System.out.println(classWithStringArg.getFirst());

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        ExampleWithList exampleWithList = applicationContext1.getBean("exampleWithList",ExampleWithList.class);
        Map<String,Integer> map=exampleWithList.getMyint();

        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }

}
