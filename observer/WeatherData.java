package observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer_> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer_>();
    }

    @Override
    public void registerObserver(Observer_ o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer_ o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for(Observer_ observer : observers){
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
    }
}