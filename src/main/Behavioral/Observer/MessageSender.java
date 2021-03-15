package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessageSender {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver( Observer observer ) {
        this.observers.add(observer);
    }

    public void removeObserver( Observer observer ) {
        this.observers.remove(observer);
    }

    public void noticeAll() {
        observers.forEach(Observer::notice);
    }
}
