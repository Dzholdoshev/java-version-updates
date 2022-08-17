package task1_functional_interface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(100, Color.GREEN));
        apples.add(new Apple(250, Color.RED));
        apples.add(new Apple(80, Color.RED));
        apples.add(new Apple(350, Color.GREEN));

        apples.forEach(apple -> System.out.println(apple));


        findApples(apples, apple -> "A " + apple.getColor().label + " apple");


        findApples(apples, apple -> {
            String ch = apple.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + ch + " " + apple.getColor() + " orange";
        });


    }

    public static <Apple> void findApples(List<Apple> list, Function<Apple, String> method) {
        for (Apple apple : list) {
            String output = method.apply(apple);
            System.out.println(output);
        }

    }


}


