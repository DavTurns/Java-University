public class Placintarie {

    public Placinta coace(String ceFel){
        Placinta placinta = new Placinta(ceFel);
        if("Placinta cu Cartofi".equals(ceFel)){
            placinta.puneBranza();
            placinta.puneCartofi();
        }
        if("Placinta cu Gem".equals(ceFel)){
            placinta.puneGem();
        }
        return placinta;

    }
}
