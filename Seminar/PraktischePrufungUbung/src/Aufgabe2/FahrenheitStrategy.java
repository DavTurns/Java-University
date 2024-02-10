package Aufgabe2;

public class FahrenheitStrategy implements TemperatureStrategy{
    @Override
    public Temperatur convert(Temperatur temperatur) {
        if(temperatur.getMaßeinheit().equals("C")){
            temperatur.setMaßeinheit("F");
            temperatur.setWert(temperatur.getWert()*33.8f);
        }
        return temperatur;
    }
}
