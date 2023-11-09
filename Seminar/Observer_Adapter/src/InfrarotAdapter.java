public class InfrarotAdapter implements InfrarotSicht{
    
    private Camera camera;

    public InfrarotAdapter(Camera camera) {
        this.camera = camera;
    }
    @Override
    public void siehtImDunkeln(String name) {
        System.out.printf("Infrarot Adapter wird benutzt");
        camera.sieht(name);
    }
}
