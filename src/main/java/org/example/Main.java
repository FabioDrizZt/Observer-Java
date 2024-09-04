package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos el sujeto
        WeatherStation weatherStation = new WeatherStation();
        // Creamos los observadores
        TemperatureAlert alert = new TemperatureAlert();
        TemperatureDisplay display = new TemperatureDisplay();
        TemperatureLogger logger = new TemperatureLogger();
        // Añadimos los observadores al sujeto
        weatherStation.addObserver(alert);
        weatherStation.addObserver(display);
        weatherStation.addObserver(logger);

        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(32.0f);
        weatherStation.setTemperature(4.0f);
    }
}