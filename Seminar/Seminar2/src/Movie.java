public class Movie {
    private String title;
    private double basePrice;

    public Movie(String title, double basePrice) {
        this.title = title;
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double calculatePrice() {
        return basePrice;
    }
}
