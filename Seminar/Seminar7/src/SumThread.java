import java.util.List;

public class SumThread extends Thread{
    private List<Integer> numbers;
    private int start, end, sum = 0;

    public SumThread(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run(){
        for(int i = start; i < end; i++) {
            sum += numbers.get(i);
        }


    }
}
