package task2_functional_interface;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@ToString

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private String email;

    public Person(String firstName, String lastName, Integer age, Gender gender, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;

        DB_SocialNetwork.DB.add(this);
    }
}
