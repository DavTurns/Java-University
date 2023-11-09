import java.util.Iterator;

public class DeckIterator implements Iterator<Spielkarte> {

    private int index;
    private Deck deck;
    public DeckIterator(Deck deck) {
        this.deck = deck;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < deck.getKarten().size();
    }

    @Override
    public Spielkarte next() {
        if(hasNext()) {
            return deck.getKarten().get(index++);
        }
        throw new IndexOutOfBoundsException();
    }

}
