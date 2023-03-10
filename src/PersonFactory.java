import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;
    public PersonFactory() {
        allPersons = new ArrayList<Person>();
    }

    public void addPerson(Person person) {
        for (int i = 0; i < allPersons.size(); i++) {
            if (person.getLastName().compareTo(allPersons.get(i).getLastName()) <= 0){
                allPersons.add(i, person);
                return;
            }
        }
        allPersons.add(0, person);
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<Person>();
        for (int i = 0; i < allPersons.size(); i++) {
            if (allPersons.get(i).getAge() < 18) {
                under18.add(allPersons.get(i));
            }
        }
        return under18;
        }


    public boolean checkLastName(String lastName) {
        for (int i = 0; i < allPersons.size(); i++){
            if (lastName.equals(allPersons.get(i).getLastName())){
                return true;
            }
        }
        return false;
    }
}
