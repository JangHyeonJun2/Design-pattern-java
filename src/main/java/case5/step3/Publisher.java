package case5.step3;

public interface Publisher {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
