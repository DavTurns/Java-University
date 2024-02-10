import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {

    private AtomicInteger currentValue = new AtomicInteger(0);

    private int limit;

    public SharedCounter(int limit) {
        this.limit = limit;
    }

    public void increment(){
        for(int i  =  0; i < limit; i++){
            currentValue.incrementAndGet();
        }
    }
    public AtomicInteger getCurrentValue() {
        return currentValue;
    }

    public int getLimit() {
        return limit;
    }

}
