package home.lev.hibernate.main;

import home.lev.hibernate.entity.Person;
import home.lev.hibernate.entityDAO.PersonDao;
import org.hibernate.cfg.annotations.reflection.XMLContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RunMe {


    ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/hibernate-context.xml");
    public void go(){
        PersonDao personDao= (PersonDao) xmlApplicationContext.getBean("personDao");
        Person p1 = new Person();

        p1.setName("fg");
        p1.setCountry("Zambezi");
        personDao.savePerson(p1);
        List<Person>list = personDao.getAllPersons();
        for (Person person : list) {
            System.out.println(person);
        }

    }

    public static void main(String[] args) {
    RunMe runMe = new RunMe();
        runMe.go();
    }
}
