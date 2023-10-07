public class Weatherstation {
    public int[] temperatures;

    public Weatherstation(int[] temperatures) {
        this.temperatures = temperatures;
    }

    public int averageTemp(){
        int sum = 0;

        for(int i = 0;i<temperatures.length;i++){
            sum += temperatures[i];
        }
        return sum/temperatures.length;
    }

    public int[] maxTemp(){
        int min = temperatures[0];
        int max = temperatures[0];
        for(int i = 1;i<temperatures.length;i++){
            if(temperatures[i] > max) max = temperatures[i];
            if(temperatures[i] > min) min = temperatures[i];
        }
        return new int[]{min, max};
    }

    public int[] maxDifference(){
        int maxdifference = 0;
        int day1 = 0;
        int day2 = 0;
        int difference;
        for(int i = 0; i< temperatures.length-1; i++){

            difference = Math.abs(temperatures[i]-temperatures[i+1]);
            if(difference > maxdifference){
                day1 = i;
                day2 = i+1;
                maxdifference = difference;
            }
        }
        return new int[]{day1,day2};
    }

    public void printTable(){

        System.out.println("Day | Temperature");

        for(int i = 1; i< temperatures.length+1; i++){
            System.out.println(Integer.toString(i) + " | " + Integer.toString(temperatures[i-1]) + "°C");
        }


    }




}
