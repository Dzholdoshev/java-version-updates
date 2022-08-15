package test;

public class Main {
    public static void main(String[] args) {

        System.out.println("Operation task");
        calculate(3,5,Operation.PLUS);

    }

    public static void calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;

        }
    }
}

