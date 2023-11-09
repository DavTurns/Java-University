public class Drohne implements Klauen{
    private SchmuckDieb schmuckDieb;

    public Drohne(SchmuckDieb schmuckDieb) {
        this.schmuckDieb = schmuckDieb;
    }

    @Override
    public void klauen() {
        schmuckDieb.verwendetDrohneZumKlauen();
    }
}
