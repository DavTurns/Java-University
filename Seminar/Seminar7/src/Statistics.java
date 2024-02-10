import java.util.ArrayList;
import java.util.List;

public class Statistics {

    List<Integer> numbers;
    private final int NR_THREADS = 4;
    private int chunksize = 0;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Statistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void statsCompute() throws InterruptedException {
        System.out.println("Sum: " + Integer.toString(this.computeSum()));
        System.out.println("Max: " + Integer.toString(this.computeMax()));
    }

    public int computeSum() throws InterruptedException {

        List<Thread> sumThreads = new ArrayList<>();
        int start, end, sum = 0;
        chunksize = this.numbers.size() / this.NR_THREADS;

        for (int i = 0; i < this.NR_THREADS; i++) {
            start = i * chunksize;
            end = (i + 1) * chunksize;
            if (end > numbers.size())
                end = numbers.size();
            sumThreads.add(new SumThread(numbers, start, end));
        }

        for (int i = 0; i < NR_THREADS; i++) {
            sumThreads.get(i).start();
        }

        for (int i = 0; i < NR_THREADS; i++) {
            sumThreads.get(i).join();
        }

        for (Thread t : sumThreads) {
            sum += ((SumThread) t).getSum();
        }

        return sum;
    }


    public int computeMax() throws InterruptedException {

        List<Thread> sumThreads = new ArrayList<>();
        int start, end = 0, max = 0;
        chunksize = this.numbers.size() / this.NR_THREADS;

        for (int i = 0; i < this.NR_THREADS; i++) {
            start = i * chunksize;
            end = (i + 1) * chunksize;
            sumThreads.add(new MaxThread(numbers, start, end));
        }
        if (end > numbers.size())
            end = numbers.size();


        for (int i = 0; i < NR_THREADS; i++) {
            sumThreads.get(i).start();
        }

        for (int i = 0; i < NR_THREADS; i++) {
            sumThreads.get(i).join();
        }

        for (Thread t : sumThreads) {
            if (((MaxThread) t).getMax() > max) max = ((MaxThread) t).getMax();
        }

        return max;
    }

}
