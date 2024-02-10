import java.util.List;

public class MaxThread extends Thread{
    private List<Integer> numbers;
    private int start, end, max = 0;

    public MaxThread(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run(){
        for(int i = start; i < end; i++) {
            if (numbers.get(i) > max) max = numbers.get(i);
        }
    }
}
