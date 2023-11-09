// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Camera c1 = new Camera("c1");
        Camera c2 = new Camera("c2");
        Camera c3 = new Camera("c3");

        SchmuckDieb dieb1 = new SchmuckDieb();
        MoneyDieb dieb2 = new MoneyDieb();
        dieb1.register(c1);
        dieb1.register(c2);

        dieb2.register(c2);
        dieb2.register(c3);

        dieb1.klauen();
        dieb2.klauen();
    }
}