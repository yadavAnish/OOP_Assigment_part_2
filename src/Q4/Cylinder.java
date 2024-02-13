package Q4;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    double getVolume() {
        return super.getArea() * height;
    }
}
