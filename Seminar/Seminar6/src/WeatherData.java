import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    private List<Observer> observers;
    private float temperature;
    private int humidity;
    private float airPressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }
    //Sie sollte Methoden zum Registrieren, Entfernen und Benachrichtigen
    //von Beobachtern haben

    @Override
    public void register(Observer newObserver){
        observers.add(newObserver);
    }
    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer o: observers) {
            o.update(temperature,humidity,airPressure);
        }
    }

    public void setMeasurements(float temperature, int humidity, float airPressure){
        this.temperature = temperature;
        this.airPressure = airPressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
