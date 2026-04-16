package observer;

// Observer pattern - Defines a one-to-many relationship between objects so that
// when one object's state changes , all its dependents are notified
// and updated automatically

// Design principles -

//1. Encapsulate what varies
//2. Program to an interface , not an implemenation
//3. Favour composition over inheritance
//4. Strive for loosely coupled design between objects that interact

public class WeatherStation{

    public static void main(String[]args){

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(88, 55, 29);
        weatherData.setMeasurements(99, 22, 23); 
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(22, 33, 22);
    }

}