package task3.TemperatureConverter;

public class TemperatureConverter {
    public float toFahrenheit(float fahrenheit) {
        return (5 * (fahrenheit - 32)) / 9;
    }

    public float toCelsius(float celsius) {
        return (9 * celsius + (32 * 5)) / 5;
    }

}
