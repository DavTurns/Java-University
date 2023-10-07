public class Operations {
    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        double result = 0.0;

        for(int i = 0; i < y; i++) result = add(result, x);

        return result;
    }


    public boolean perfectNumber(int nr) {
        int sum = 0;
        for(int i = 1; i <= nr/2 ; i++) {
            if(nr%i == 0){
                sum+= i;
            }
        }
        if(sum==nr) return true;
        return false;
    }
}
