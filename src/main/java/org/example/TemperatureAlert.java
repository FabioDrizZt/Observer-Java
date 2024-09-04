package org.example;
import org.example.observer.Observer;

public class TemperatureAlert implements Observer {
    private float temperature;

    @Override
    public void update(float temperature){
        this.temperature = temperature;
        alert();
    }

    public void alert(){
        if (temperature > 28.0f) {
            System.out.println("Alerta de temperatura alta: " + temperature + "°C");
        } else if (temperature < 5.0f) {
            System.out.println("Alerta de temperatura baja: " + temperature + "°C");
        }
    }
}
