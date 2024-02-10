public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrenntConditionDisplay currentConditionsDisplay = new
                CurrenntConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
// Simulate changes in weather data
        weatherData.setMeasurements(75, 60, 30.4f);
        weatherData.setMeasurements(80, 65, 29.2f);
        weatherData.setMeasurements(72, 55, 29.5f);
    }
}