public class Spielkarte {
    private Color color;
    private int wert;

    public Spielkarte(Color color, int wert) {
        this.color = color;
        this.wert = wert;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Spielkarte{" +
                "color='" + color + '\'' +
                ", wert=" + wert +
                '}';
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}
