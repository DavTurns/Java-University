// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //eine person kann nicht direkt den dieb sehen, weil diese in einem anderen haus sind
        Camera c1 = new Camera("normale camera");
        InfrarotAdapter a1 = new InfrarotAdapter(c1);

        InfrarotCamera infrarotCamera = new InfrarotCamera("infrarotcamera1");
        InfrarotCamera infrarotCamera2 = new InfrarotCamera("infrarotcamera2");
        Camera c2 = new Camera("c2");

        DunkelDieb dieb1 = new DunkelDieb("DIEB1");

        dieb1.register(a1);
        dieb1.register(infrarotCamera);
        dieb1.register(infrarotCamera2);

        dieb1.klautImDunkeln();
    }
}