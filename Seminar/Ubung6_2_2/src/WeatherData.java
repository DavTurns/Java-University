import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    public List<Observer> observers;
    public int temperatur;
    public int lufteuchtigkeit;
    public float luftdruck;

    public WeatherData() {
        this.observers= new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(this.temperatur,this.lufteuchtigkeit,this.luftdruck);
        }


    }
    public void setMeasurements(int temperatur,int lufteuchtigkeit,float luftdruck){
        this.temperatur=temperatur;
        this.lufteuchtigkeit=lufteuchtigkeit;
        this.luftdruck=luftdruck;
        notifyObservers();
    }
}
