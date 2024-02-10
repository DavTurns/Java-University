public class PayRON implements Pay{

    @Override
    public void pay(int amount){
        System.out.println("Paid the amount: " + amount + " in RON.");
    }

}
