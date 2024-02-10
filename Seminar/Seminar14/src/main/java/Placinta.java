import java.util.ArrayList;
import java.util.List;

public class Placinta {
    private List<String> umpluturi = new ArrayList<>();

    private String name;

    public void puneBranza(){
        umpluturi.add("Branza");
    }

    public void puneGem(){
        umpluturi.add("Gem");
    }

    public void puneVarza(){
        umpluturi.add("Varza");
    }

    public void puneCartofi(){
        umpluturi.add("Varza");
    }
    public Placinta( String name) {
        this.name = name;
    }
}
