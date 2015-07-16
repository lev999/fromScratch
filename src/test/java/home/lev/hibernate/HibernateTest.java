package home.lev.hibernate;

import home.lev.hibernate.entity.Person;
import home.lev.hibernate.entityDAO.PersonDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/hibernate-context.xml")
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class HibernateTest {

    @Autowired
    PersonDao personDao;

    @Test
    public void myFirstTest(){
        Person p1 = new Person();
        p1.setName("Gongua");
        personDao.savePerson(p1);
        for (Person person : personDao.getAllPersons()) {
            System.out.println(person);
        }
    }


}
