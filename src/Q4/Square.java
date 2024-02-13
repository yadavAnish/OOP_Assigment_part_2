package Q4;

class Square extends GeometricObject implements Colorable {
    @Override
    double getArea() {
        return 0; // Area of a square is not applicable
    }

    @Override
    double getVolume() {
        return 0; // Volume of a square is not applicable
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides of the square.");
    }
}
