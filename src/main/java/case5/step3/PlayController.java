package case5.step3;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private boolean play;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
//        for (Observer observer : observers) {
//            observer.update(play);
//        }
        for (int i=0; i<observers.size(); i++) {
            observers.get(i).update(play);
        }
    }

    public void setFlag(boolean play) {
        this.play = play;
        notifyObservers();
    }

    public boolean isPlay() {
        return play;
    }
}
