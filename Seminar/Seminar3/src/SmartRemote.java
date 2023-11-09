import java.util.Iterator;

public class SmartRemote extends Remote {

    public SmartRemote(Tv tv) {
        super(tv);
    }

    @Override
    public boolean hasNext() {
        //bad idea as circular
        return true;
    }

    @Override
    public String next() {
        System.out.println("changing channel...");
        return tv.channelUp();
    }
}
