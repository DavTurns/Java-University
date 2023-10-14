public class ComedyMovieDiscounter implements Discounter {

    @Override
    public double calculatePrice(double baseprice) {
        return baseprice * 0.5;
    }
}
