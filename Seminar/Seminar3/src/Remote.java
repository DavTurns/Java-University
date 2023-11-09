import java.util.Iterator;

public class Remote implements Iterator<String> {

    private int index;
    protected Tv tv;


    public Remote(Tv tv) {
        this.tv = tv;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        //bad idea as circular
        return true;
    }

    @Override
    public String next() {

        return tv.channelUp();

    }
}
