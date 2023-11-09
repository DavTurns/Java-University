import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Spielkarte> {
    private List<Spielkarte> karten;

    public Deck(List<Spielkarte> karten) {
        this.karten = karten;
    }

    public void addKarte(Spielkarte s){
        karten.add(s);
    }

    public List<Spielkarte> getKarten() {
        return karten;
    }

    @Override
    public Iterator<Spielkarte> iterator() {
        return new DeckIterator(this);
    }
}
