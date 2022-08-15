package com.cydeo.lambdaIntro;

import java.awt.desktop.AppForegroundListener;
import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(500,Color.RED));

        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());

     //   ApplePredicate heavyApple1 = (apple) -> apple.getWeight() > 200;
    //    filterApples(inventory,heavyApple1);
        filterApples(inventory,(apple) -> apple.getWeight() > 200);


        System.out.println(heavyApple);
        System.out.println(greenApple);
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate method){

       List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory) {
            if(method.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


}
