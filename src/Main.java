import task2.circle.Circle;
import task3.TemperatureConverter.TemperatureConverter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("The circle radius is:");
        circle.calculateArea();
        System.out.println();
        System.out.println();
        TemperatureConverter converter = new TemperatureConverter();
        float roomTemp = 25.6f;
        System.out.println(roomTemp);
        float roomTempF = converter.toFahrenheit(roomTemp);
        float roomTempC = converter.toCelsius(roomTempF);
        System.out.println(roomTempF);
        System.out.println(roomTempC);
    }
}