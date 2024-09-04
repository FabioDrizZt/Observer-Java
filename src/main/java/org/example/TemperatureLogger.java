package org.example;
import org.example.observer.Observer;

public class TemperatureLogger implements Observer {
    private float temperature;

    @Override
    public void update(float temperature){
        this.temperature = temperature;
        log();
    }

    public void log(){
        // Conexion a la base de datos
        // Guardar en la BD
        System.out.println("Registro de tempera guardado en BD: " + temperature + "°C");
    }
}
