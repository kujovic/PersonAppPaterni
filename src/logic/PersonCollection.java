package logic;

import domain.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefan.kujovic
 */
public class PersonCollection {

    private List<Person> persons;

    public PersonCollection() {
        persons = new ArrayList<>();
    }

    public List<Person> getPersons() {
        return persons;
    }
    
    public void add(Person person){
        persons.add(person);
    }
}
