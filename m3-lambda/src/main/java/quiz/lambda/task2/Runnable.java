package quiz.lambda.task2;
@FunctionalInterface
interface Runnable {
    void run();
 //   void shutDown();  <------- shouldn't put here second method, it won't be @functional interface
}