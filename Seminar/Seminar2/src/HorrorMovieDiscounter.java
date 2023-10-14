public class HorrorMovieDiscounter implements Discounter {

    @Override
    public double calculatePrice(double baseprice) {
        return baseprice * 0.9;
    }
}
