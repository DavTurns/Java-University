package Aufgabe2;

public class CelsiusStrategy implements TemperatureStrategy{
    @Override
    public Temperatur convert(Temperatur temperatur) {
        if(temperatur.getMaßeinheit().equals("F")){
            temperatur.setMaßeinheit("C");
            temperatur.setWert(temperatur.getWert()/33.8f);
        }
        return temperatur;
    }
}
