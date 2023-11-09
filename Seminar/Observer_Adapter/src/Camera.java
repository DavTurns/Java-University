public class Camera implements Observer{

    private Mensch p;

    public Camera(Mensch p) {
        this.p = p;
    }

    @Override
    public void update(String name) {
        p.hatGesehen(name);
    }

}
