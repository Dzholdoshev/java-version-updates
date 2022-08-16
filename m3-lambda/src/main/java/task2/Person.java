package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import task1Lambda.Strings;

@Setter
@Getter

@ToString

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private final char sex;
    private String email;

    public Person(String firstName, String lastName, Integer age, char sex, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.email = email;

        DB_SocialNetwork.DB.add(this);
    }
}
