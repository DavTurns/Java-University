package Aufgabe2;

import java.util.List;

public class CitizenCountThread extends Thread{

    private float sum = 0;

    private int start;

    private int end;

    private List<Stadt> stadtList;

    public CitizenCountThread( int start, int end, List<Stadt> stadtList) {
        this.start = start;
        this.end = end;
        this.stadtList = stadtList;
    }
    @Override
    public void run(){
        for(int i = start; i < end; i++){
            sum += stadtList.get(i).getTemperaturList().stream().map(Temperatur::getWert).reduce(0.0f, Float::sum);
        }
    }

    public float getSum() {
        return sum;
    }
}
