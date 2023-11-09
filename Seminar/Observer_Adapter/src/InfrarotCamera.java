public class InfrarotCamera implements InfrarotSicht{

    private String name;

    public InfrarotCamera(String name) {
        this.name = name;
    }

    @Override
    public void siehtImDunkeln(String name) {
        System.out.printf(this.name+ " sieht "+ name+"\n");
    }
}
