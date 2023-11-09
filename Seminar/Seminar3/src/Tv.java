import java.util.Iterator;
import java.util.List;

public class Tv implements Iterable<String> {

    private String brand;
    private List<String> channels;

    private int index;

    private Remote remote;

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Tv(String brand, List<String> channels) {
        this.brand = brand;
        this.channels = channels;
        this.index = 0;
    }

    public String channelUp() {
        this.index += 1;
        if (index == channels.size()) index = 0;
        return channels.get(index);
    }
    public String channelDown() {
        this.index -= 1;

        if(index < 0)
            index = channels.size() - 1;
        return channels.get(index);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", current channel =" + channels.get(index) +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }


    @Override
    public Iterator<String> iterator() {
        return remote;
    }
}
