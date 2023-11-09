import java.util.ArrayList;
import java.util.List;

public class SchmuckDieb implements Klauen, Observable{

    private List<Observer> cameras;

    public SchmuckDieb() {
        this.cameras = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for(Observer o: cameras) {
            o.update();
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
