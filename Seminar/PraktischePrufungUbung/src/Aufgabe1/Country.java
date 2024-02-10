package Aufgabe1;

import java.util.Objects;

public class Country {
    private String name;
    private String continent;
    private Long fläche;
    private Long bevölkerung;
    private String hauptstadt;

    public String toCSV() {
        return name+";"+continent+";"+Long.toString(fläche)+";"+Long.toString(bevölkerung)+";"+hauptstadt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Long getFläche() {
        return fläche;
    }

    public void setFläche(Long fläche) {
        this.fläche = fläche;
    }

    public Long getBevölkerung() {
        return bevölkerung;
    }

    public void setBevölkerung(Long bevölkerung) {
        this.bevölkerung = bevölkerung;
    }

    public String getHauptstadt() {
        return hauptstadt;
    }

    public void setHauptstadt(String hauptstadt) {
        this.hauptstadt = hauptstadt;
    }

    public Country(String name, String continent, Long fläche, Long bevölkerung, String hauptstadt) {
        this.name = name;
        this.continent = continent;
        this.fläche = fläche;
        this.bevölkerung = bevölkerung;
        this.hauptstadt = hauptstadt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(continent, country.continent) && Objects.equals(fläche, country.fläche) && Objects.equals(bevölkerung, country.bevölkerung) && Objects.equals(hauptstadt, country.hauptstadt);
    }


    public static Country parseFromString(String line){
        String[] content = line.split(" ");

        return new Country(content[0],content[1], Long.parseLong(content[2]),Long.parseLong(content[3]),content[4]);
    }
}
