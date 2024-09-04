package org.example;
import org.example.observer.Observer;

public class TemperatureDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature){
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("Display de temperatura: " + temperature + "°C");
    }
}
