package home.lev.hibernate;

import home.lev.hibernate.entity.Person;
import home.lev.hibernate.entityDAO.PersonDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/hibernate-context.xml")
public class HibernateTest {

    @Autowired
    PersonDao personDao;

    @Test
    public void myFirstTest(){
        Person p1 = new Person();
        p1.setName("Gongua");
        personDao.savePerson(p1);
    }


}
