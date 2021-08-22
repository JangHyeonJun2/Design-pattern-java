package case5.step2;

public interface Publisher {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
