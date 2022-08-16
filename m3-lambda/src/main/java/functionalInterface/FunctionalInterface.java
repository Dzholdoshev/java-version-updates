package functionalInterface;

import task1Lambda.Apple;
import task1Lambda.AppleOutput;
import task1Lambda.AppleTest;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        AppleOutput ap = new AppleOutput() {
            @Override
            public String test(Apple apple) {
                return "Cydeo";
            }
        };

       //************************************PREDICATE**********************************

        Predicate<Integer> lesserThan = i ->  i<18;
        System.out.println(lesserThan.test(20));

        //************************************CONSUMER**********************************

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //************************************BI CONSUMER**********************************

        BiConsumer <Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);

        //************************************BI CONSUMER**********************************

        Function <String,String> fun = s ->  "Hello " + s;
        System.out.println( fun.apply("Cydeo"));

        //************************************BI FUNCTION**********************************
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        //************************************SUPPLIER**********************************
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());



    }
}
