package com.cydeo;

import javax.sound.midi.Soundbank;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {


        //Zero argument constructor
        Supplier<Car> c1 = () -> new Car();

        System.out.println(c1.get().getModel());


        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One Argument Constructor

        Function<Integer, Car> f1 = model -> new Car(model);

        Function<Integer, Car> f2 = Car::new;


        //Two argument constructor

        BiFunction<String, Integer, Car> bi1 = (make, model) -> new Car(make, model);

        BiFunction<String, Integer, Car> bi2 = Car::new;

        Car honda = bi2.apply("Honda", 2015);


        System.out.println(honda.getMake() + " " + honda.getModel());

    }
}
