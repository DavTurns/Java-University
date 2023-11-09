import java.util.ArrayList;
import java.util.List;

public class SchmuckDieb implements Klauen, Observable{

    private List<Observer> cameras;
    private String name;

    @Override
    public String toString() {
        return "SchmuckDieb{" +
                "name='" + name + '\'' +
                '}';
    }

    public SchmuckDieb(String name) {
        this.cameras = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void notifyObservers() {
        for(Observer o: cameras) {
            o.update(name);
        }
    }

    @Override
    public void remove(Observer observer) {
        cameras.remove(observer);
    }

    @Override
    public void register(Observer newObserver) {
        cameras.add(newObserver);
    }

    @Override
    public void klauen() {
        System.out.printf("Schmuckdieb klaut");
        notifyObservers();
        System.out.printf("\n\n");
    }
}
