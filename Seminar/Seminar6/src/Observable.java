public interface Observable {
    public void notifyObservers();

    public void remove(Observer observer);

    public void register(Observer newObserver);
}
