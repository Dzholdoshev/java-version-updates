package task1withoutLambda;

public class AppleWeightOutput implements AppleOutput {

    @Override
    public String  test(Apple apple) {
        return "An apple of " + apple.getWeight()  + "g";

    }


}
