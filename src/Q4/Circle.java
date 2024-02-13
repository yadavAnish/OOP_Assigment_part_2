package Q4;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return 0; // Volume of a 2D shape is not applicable
    }
}
