import java.util.ArrayList;
import java.util.List;

public class DunkelDieb implements Observable{

    private List<InfrarotSicht> cameras;
    private String name;

    @Override
    public String toString() {
        return "SchmuckDieb{" +
                "name='" + name + '\'' +
                '}';
    }

    public DunkelDieb(String name) {
        this.cameras = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void notifyObservers() {
        for(InfrarotSicht o: cameras) {
            o.siehtImDunkeln(this.name);
        }
    }

    @Override
    public void remove(InfrarotSicht observer) {
        cameras.remove(observer);
    }

    @Override
    public void register(InfrarotSicht newObserver) {
        cameras.add(newObserver);

    }

    public void klautImDunkeln() {
        System.out.printf("Dunkeldieb klaut im dunkeln:\n");
        notifyObservers();
        System.out.printf("\n\n");
    }
}
