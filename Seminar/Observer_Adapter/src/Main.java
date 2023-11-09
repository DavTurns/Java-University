// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //eine person kann nicht direkt den dieb sehen, weil diese in einem anderen haus sind
        Person person = new Person("Bob");
        Camera c1 = new Camera(person);
        Camera c2 = new Camera(person);

        SchmuckDieb dieb1 = new SchmuckDieb("DIEB1");
        MoneyDieb dieb2 = new MoneyDieb("DIEB2");

        dieb1.register(c1);
        dieb1.register(c2);

        dieb2.register(c2);

        dieb1.klauen();
        dieb2.klauen();
    }
}