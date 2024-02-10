package Aufgabe2;

import java.util.Objects;

public class Temperatur {
    private float wert;
    private String maßeinheit;
    private int monat;

    private void verifyMonat(int monat){
        if(monat < 1 || monat > 12) throw new IllegalArgumentException("Monat muss 1-12 sein");
    }

    public float getWert() {
        return wert;
    }

    public void setWert(float wert) {
        this.wert = wert;
    }

    public String getMaßeinheit() {
        return maßeinheit;
    }

    public void setMaßeinheit(String maßeinheit) {
        this.maßeinheit = maßeinheit;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        verifyMonat(monat);
        this.monat = monat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperatur that = (Temperatur) o;
        return Float.compare(wert, that.wert) == 0 && monat == that.monat && Objects.equals(maßeinheit, that.maßeinheit);
    }


    @Override
    public String toString() {
        return "Temperatur{" +
                "wert=" + String.format("%.2f", wert) +
                ", maßeinheit='" + maßeinheit + '\'' +
                ", monat=" + monat +
                '}';
    }

    public Temperatur(float wert, String maßeinheit, int monat) {
        verifyMonat(monat);

        this.wert = wert;
        this.maßeinheit = maßeinheit;
        this.monat = monat;
    }
}
