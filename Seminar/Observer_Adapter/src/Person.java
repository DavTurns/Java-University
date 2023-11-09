public class Person implements Mensch{

    private String name;

    @Override
    public void hatGesehen(String name){
        System.out.printf(this.name + " hat gesehen" + name+"\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
