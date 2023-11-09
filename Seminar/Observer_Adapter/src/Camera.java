public class Camera {

    private String name;

    public Camera(String name) {
        this.name = name;
    }
    public void sieht(String name) {
        System.out.println(this.name+ " hat entdeckt"+ name);
    }

}
