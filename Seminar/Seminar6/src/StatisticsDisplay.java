public class StatisticsDisplay implements Observer, Display{

    private float temperature;
    private int humidity;
    private float airPressure;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.register(this);
    }

    @Override
    public void display() {
        System.out.printf("CurrentData: " + temperature +"°C " + airPressure + "hPa " + humidity + "%");
    }

    @Override
    public void update(float temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        display();
    }
}
