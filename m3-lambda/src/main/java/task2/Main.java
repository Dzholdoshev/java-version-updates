package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("Henry", "Thomson", 21, 'M', "h.tomson@gmail.com");
        Person person2 = new Person("John", "Smith", 45, 'M', "j.smith@gmail.com");
        Person person3 = new Person("George", "Stone", 23, 'M', "g.stone@gmail.com");
        Person person4 = new Person("Alice", "Patrick", 19, 'F', "a.patrick@gmail.com");
        Person person5 = new Person("Sarah", "Fisher", 37, 'F', "a.fisher@gmail.com");

        findMePerson(DB_SocialNetwork.DB, person -> person.getAge()>18&&person.getAge()<25&&person.getSex()=='M');


    }
    public static void findMePerson(List<Person> list, Searching method) {
        List<Person> result = new ArrayList<>();
        for (Person person : list) {
            if (method.test(person)) {
                result.add(person);
                System.out.println("Hello," + person.getFirstName() + " we will send you message to your e-mail:"+person.getEmail() );
            }
        }


    }


}
