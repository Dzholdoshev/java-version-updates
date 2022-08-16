package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("Henry", "Thomson", 21, Gender.MALE, "h.tomson@gmail.com");
        Person person2 = new Person("John", "Smith", 45, Gender.MALE, "j.smith@gmail.com");
        Person person3 = new Person("George", "Stone", 23, Gender.MALE, "g.stone@gmail.com");
        Person person4 = new Person("Alice", "Patrick", 19, Gender.FEMALE, "a.patrick@gmail.com");
        Person person5 = new Person("Sarah", "Fisher", 37, Gender.FEMALE, "a.fisher@gmail.com");

        findMePerson(DB_SocialNetwork.DB, person -> person.getAge()>18&&person.getAge()<25&&person.getGender()==Gender.MALE);



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
