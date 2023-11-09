import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Spielkarte> cards = new ArrayList<>();
        cards.add(new Spielkarte(Color.Pik, 10));
        cards.add(new Spielkarte(Color.Kreuz, 9));
        cards.add(new Spielkarte(Color.Karo, 7));
        Deck deck = new Deck(cards);

        for(int i = 0; i< deck.getKarten().size(); i++) {
            System.out.println(deck.getKarten().get(i));
        }

        for(Spielkarte s: deck) {
            System.out.println(s);
        }


        RemoteFactory rf = new RemoteFactory();

        Tv tv = new Tv("cheap", List.of("Digi","Antena3","KanalD"));

        Remote basic = rf.createRemote("basic", tv);
        tv.setRemote(basic);

        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);

        Remote remote = (Remote) tv.iterator();

        remote.next();
        remote.next();

        System.out.println(tv);
    }
}