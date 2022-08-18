package quiz.lambda.task2;

public class Main {

    public static void main(String[] args) {

        run(() -> System.out.println("System is running..."));

    }

    public static void run(Runnable runnable) {
        runnable.run();
    }

}