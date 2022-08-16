package task1withoutLambda;

public class AppleColorOutput implements AppleOutput {

    @Override
    public String  test(Apple apple) {
        return "A " + apple.getColor() + " apple";

    }



}
