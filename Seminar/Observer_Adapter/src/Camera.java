public class Camera implements Observer{

    private Person p;

    public Camera(Person p) {
        this.p = p;
    }

    @Override
    public void update(String name) {
        p.hatGesehen(name);
    }

}
