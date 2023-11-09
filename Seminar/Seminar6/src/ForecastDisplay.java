import java.util.List;

public class ForecastDisplay implements Observer, Display{

    private List<Float> data;
    private float temperature;
    private int humidity;
    private float airPressure;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.register(this);
        da
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, int humidity, float airPressure) {

    }
}
