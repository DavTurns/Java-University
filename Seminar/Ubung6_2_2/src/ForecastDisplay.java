import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Display,Observer{
    public WeatherData weatherData;
    public float temperatur;
    public float lufteuchtigkeit;
    public float luftdruck;
    public int counter=0;
    public List<Float> averageData;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.add(this);
        averageData= new ArrayList<>();
    }

    public void average(){
        if (counter==0){
            this.averageData.add(temperatur);
            this.averageData.add(lufteuchtigkeit);
            this.averageData.add(luftdruck);
        }
        else {
            averageData.set(0,(averageData.get(0)*counter+temperatur)/(counter+1));
            averageData.set(1,(averageData.get(1)*counter+lufteuchtigkeit)/(counter+1));
            averageData.set(2,(averageData.get(2)*counter+luftdruck)/(counter+1));
        }
        counter+=1;
    }

    @Override
    public void display() {

        System.out.println("Forecast Conditions:" + averageData.get(0) +" " + averageData.get(1) +" " + averageData.get(2));
    }

    @Override
    public void update(int temperatur,int lufteuchtigkeit,float luftdruck) {

        this.temperatur=temperatur;
        this.lufteuchtigkeit=lufteuchtigkeit;
        this.luftdruck=luftdruck;
        average();
        display();
    }
}
