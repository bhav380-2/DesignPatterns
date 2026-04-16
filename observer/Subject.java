package observer;

public interface Subject {
    public void registerObserver(Observer_ o);
    public void removeObserver(Observer_ o);
    public void notifyObservers();
}