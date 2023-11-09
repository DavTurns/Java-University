import java.util.ArrayList;
import java.util.List;

public class MoneyDieb implements  Klauen, Observable{

    private List<Observer> cameras;

    @Override
    public String toString() {
        return "MoneyDieb{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public MoneyDieb(String name) {
        this.cameras = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void klauen() {
        System.out.println("Moneydieb klaut");
        notifyObservers();
        System.out.printf("\n\n");
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
}
