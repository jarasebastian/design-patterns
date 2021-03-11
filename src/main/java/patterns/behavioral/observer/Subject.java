package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class Subject {
    
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    
    public int getState(){
        return state;
    }
    
    public void setState(int state){
        this.state = state;
        notifyToAllObservers();
    }
    
    public void add(Observer observer){
        observers.add(observer);
    }
    
    public void notifyToAllObservers(){
        observers.forEach(x -> x.update());
    }
    
}
