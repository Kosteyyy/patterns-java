package observer.weatherstation;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Погода улучшается!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Ничего нового");
        } else if (currentPressure < lastPressure) {
            System.out.println("Берегитесь похолодания, дождливой погоды!");
        }
    }

}
