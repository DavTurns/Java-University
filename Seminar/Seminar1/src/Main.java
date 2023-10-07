// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String reverse(String input) {

        StringBuilder builder = new StringBuilder();

        for(int i = input.length() - 1; i >= 0; i--){
            char ch = input.charAt(i);
            builder.append(ch);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        Operations op = new Operations();
        System.out.printf("3 + 3 = ");
        System.out.println(op.add(3,3));

        System.out.printf("6 - 3 = ");
        System.out.println(op.sub(6,3));

        System.out.printf("5 * 3 = ");
        System.out.println(op.mul(5,3));

        Wordcount c = new Wordcount();
        //System.out.println(c.count("   cacamaca m aria,  eeee  dididid, oaoaoao  d"));
        System.out.println(op.perfectNumber(4944));

        int[] temp = {12,14,9,12,15,16,15,15,11,8,13,13,15,12};
        Weatherstation w1 = new Weatherstation(temp);

        System.out.println(w1.averageTemp());

        w1.printTable();
    }
}