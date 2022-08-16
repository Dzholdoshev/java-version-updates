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

       AppleTest.findApples(apples, apple ->   "A " + apple.getColor().label + " apple");
       AppleTest.findApples(apples, apple ->   "An apple of " + apple.getWeight()  + "g");


    }

    public static void findApples(List<Apple> list1, AppleOutput method) {

        for (Apple apple : list1) {
            String output = method.test(apple);
            System.out.println(output);


        }

    }


}


