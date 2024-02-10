public class CurrenntConditionDisplay implements Observer,Display{

    public WeatherData weatherData;
    public int temperatur;
    public int lufteuchtigkeit;
    public float luftdruck;

    public CurrenntConditionDisplay(WeatherData weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions:" + temperatur +" " + lufteuchtigkeit +" " + luftdruck);
    }

    @Override
    public void update(int temperatur,int lufteuchtigkeit,float luftdruck) {
        this.temperatur=temperatur;
        this.lufteuchtigkeit=lufteuchtigkeit;
        this.luftdruck=luftdruck;
        display();
    }
}
