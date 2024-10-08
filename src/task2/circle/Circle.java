package task2.circle;

public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println(PI * radius * radius);
    }

}
