package home.lev.hibernate.entityDAO;


import home.lev.hibernate.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class PersonDaoImpl implements PersonDao {

    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void savePerson(Person person) {

        Session session=sessionFactory.getCurrentSession();
        session.save(person);

    }

    public List<Person> getAllPersons() {
        Session session = sessionFactory.getCurrentSession();

        List<Person> list=session.createQuery("From Person").list();
        return list;
    }

}
