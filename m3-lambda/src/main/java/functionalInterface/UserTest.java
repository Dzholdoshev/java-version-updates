package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        User u1 = new User("Tom", "Smith", 35);
        User u2 = new User("John", "Evan", 25);
        User u3 = new User("Emma", "Pollard", 55);

        users.add(u1);
        users.add(u2);
        users.add(u3);

      printName(users, user -> user.getLastName().startsWith("E"));
        printName(users, user -> true);

    }

private static void printName(List<User> users, Predicate<User> p){
    for (User user:users) {
        if(p.test(user)){
            System.out.println(user.toString());
        }
    }
}

}

