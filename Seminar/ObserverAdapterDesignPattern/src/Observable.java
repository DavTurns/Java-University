public interface Observable {
    public void notifyObservers();

    public void remove(InfrarotSicht observer);

    public void register(InfrarotSicht newObserver);

    public String toString();
}
