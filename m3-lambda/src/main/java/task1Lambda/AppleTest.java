package task1Lambda;


import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(100, Color.GREEN));
        apples.add(new Apple(250, Color.RED));
        apples.add(new Apple(80, Color.RED));
        apples.add(new Apple(350, Color.GREEN));

        apples.forEach(apple -> System.out.println(apple));


      //  AppleOutput colorOutput = apple -> "A " + apple.getColor().label + " apple";
      //  AppleTest.findApples(apples, colorOutput);
        AppleTest.findApples(apples, apple -> "An apple of " + apple.getWeight() + "g");

        AppleOutput fancyFormatter = apple ->{
            String ch = apple.getWeight() > 200 ? "Heavy" : "Light";
            return  "A " + ch + " " + apple.getColor() + " orange";
        };

        AppleTest.findApples(apples,apple ->{
            String ch = apple.getWeight() > 200 ? "Heavy" : "Light";
            return  "A " + ch + " " + apple.getColor() + " orange";
        });

    }

    public static void findApples(List<Apple> list, AppleOutput method) {
        for (Apple apple : list) {
            String output = method.test(apple);
            System.out.println(output);
        }

    }


}


