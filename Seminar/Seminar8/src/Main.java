import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static int NR_THREADS = 4;

    public static void main(String[] args) throws InterruptedException {

        ParallelQueue inputQueue = new ParallelQueue();
        ParallelQueue outputQueue = new ParallelQueue();

            for(int i = 0; i< 50; i++)
                inputQueue.enqueue(i);
//        Thread thread1 = new Thread(() -> {
//        });
//
//        thread1.start();
//
//        thread1.join();

        List<Thread> inputThreads = new LinkedList<>();


        for(int i = 0; i <NR_THREADS; i++){
            inputThreads.add(new Thread( () -> {
                while(!inputQueue.isEmpty()){
                    try {
                        int x = inputQueue.deque();
                        outputQueue.enqueue(x);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            ));
        }

        Thread resultThread = new Thread( () -> {
            while(!outputQueue.isEmpty() || !inputQueue.isEmpty()) {
                try {
                    int number = outputQueue.deque();
                    System.out.println("Thread element dequeued: " + number);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        resultThread.start();

        for(int i = 0; i < NR_THREADS; i++) {
            inputThreads.get(i).start();
        }

    }
}