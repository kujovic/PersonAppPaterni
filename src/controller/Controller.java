package controller;

import domain.Person;
import java.util.ArrayList;
import java.util.List;
import logic.PersonCollection;
import view.MyView;

/**
 *
 * @author stefan.kujovic
 */
public class Controller {
    private static Controller instance;
    
    private PersonCollection personCollection;
    private List<MyView> views; 

    private Controller() {
        personCollection = new PersonCollection();
        views = new ArrayList<>();
    }
    public static Controller getInstance(){
        if(instance==null){
            instance = new Controller();
        }
        return instance;
    }
    
    public void addPerson(Person person){
        personCollection.add(person);
        //obavesti forme da je doslo do izmene
        for (MyView view : views) {
            view.update();
        }
    }
    public List<Person> getAllPerson(){
        return personCollection.getPersons();
    }

    public void registerView(MyView newView) {
        views.add(newView);
        newView.update();
    }

    public void setSelectedIndex(int selectedIndex) {
        for (MyView view : views) {
            view.setSelectedIndex(selectedIndex);
        }
    }
}
