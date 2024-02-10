package Aufgabe2;

import java.util.List;

public class Stadt {
    /*Jede Stadt hat einen Namen, das Land, zu dem sie gehört, und eine Liste von
Temperaturen.
*/
    private String name;
    private String country;
    private List<Temperatur> temperaturList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Temperatur> getTemperaturList() {
        return temperaturList;
    }

    public void setTemperaturList(List<Temperatur> temperaturList) {
        this.temperaturList = temperaturList;
    }

    public void addTemperatur(Temperatur temperatur){
        for( Temperatur temp : temperaturList){
            if(temp.getMonat() == temperatur.getMonat()){
                temp.setMaßeinheit(temperatur.getMaßeinheit());
                temp.setWert(temperatur.getWert());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Stadt{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", temperaturList=" + temperaturList.stream().sorted((t1,t2)-> t1.getMonat() - t2.getMonat()) +
                '}';
    }

    public void addTemperatures(List<Temperatur> temperaturen){
        for( Temperatur temp : temperaturen){
            addTemperatur(temp);
        }
    }

    public Stadt(String name, String country, List<Temperatur> temperaturList) {
        this.name = name;
        this.country = country;
        this.temperaturList = temperaturList;
    }

}
