package home.lev.hibernate.entityDAO;

import home.lev.hibernate.entity.Person;

import java.util.List;

/**
 * Created by pc-users on 7/16/2015.
 */
public interface PersonDao {
     void savePerson(Person person);
     List<Person> getAllPersons();
}
