public class Test {

    private String description;

    private int value;

    private int expectedValue;

    public void run(){
        if(value!=expectedValue){
            throw new RuntimeException("Values are not equal");
        }
    }

}
