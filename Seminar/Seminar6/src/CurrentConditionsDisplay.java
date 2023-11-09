public class CurrentConditionsDisplay implements Observer, Display{
    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.register(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, int humidity, float airPressure) {

    }
}
