public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void person(String firstName, String lastName, int age){
        this.firstName =  firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int Age){
        this.age = age;
    }

    public String toString(){
        return firstName + " " + lastName + " " + age;
    }

}
