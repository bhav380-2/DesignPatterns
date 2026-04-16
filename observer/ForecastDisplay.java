
package observer;

public class ForecastDisplay implements Observer_, DisplayElement{

    private float currentPressure = 39;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(){
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display(){
        System.out.print("weather Forecast : ");
        if(currentPressure>lastPressure){
            System.out.println(" weather improving");
        }else if(currentPressure==lastPressure){
            System.out.println(" weather is more of same");
        }else{
            System.out.println(" weather getting worse");
        }
    }

}