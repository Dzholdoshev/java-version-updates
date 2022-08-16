package task1withoutLambda;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {


        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(100, Color.GREEN));
        apples.add(new Apple(250, Color.RED));
        apples.add(new Apple(80, Color.RED));
        apples.add(new Apple(350, Color.GREEN));

      AppleTest.findApples(apples, new AppleColorOutput());
      AppleTest.findApples(apples, new AppleWeightOutput());


    }


    public static void findApples(List<Apple> list, AppleOutput method) {

        for (Apple apple : list) {
            System.out.println(method.test(apple));


        }

    }


}


