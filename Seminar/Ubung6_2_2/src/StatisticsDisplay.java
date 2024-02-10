public class StatisticsDisplay implements Display,Observer{
    public WeatherData weatherData;
    public int temperatur;
    public int lufteuchtigkeit;
    public float luftdruck;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Conditions:" + (temperatur+1) +" " + (lufteuchtigkeit+1) +" " + (luftdruck+1));
    }

    @Override
    public void update(int temperatur,int lufteuchtigkeit,float luftdruck) {
        this.temperatur=temperatur;
        this.lufteuchtigkeit=lufteuchtigkeit;
        this.luftdruck=luftdruck;
        display();
    }
}
