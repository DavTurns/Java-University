public class Camera implements Observer{

    String name;

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.printf("Camera "+name +" Dieb gefunden");
    }

}
