package oop.multithreading;

public class ThreadsTask {

    /*
    * 33. Create a new thread in main in two different ways.
    * By declaring a Task class that implements the Runnable
    * interface and using an anonymous class that implements Runnable.
    * Both threads are supposed to print 10_000 times any text and the number
    *  of the current iteration (variable and from the loop).
    * */
    public static void main(String[] args) {
        Task task1 = new Task();
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("task 2: " + i);
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

    }
}

class Task implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println("task 1: " + i);
        }
    }
}
