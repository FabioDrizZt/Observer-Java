package org.example;
import org.example.observer.Observer;
import org.example.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;

    public WeatherStation(){
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers(); // Notificando a los observadores
    }
}
