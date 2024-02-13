package Q4;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);

        Cylinder cylinder1 = new Cylinder(3, 4);
        Cylinder cylinder2 = new Cylinder(2, 6);

        // Finding larger circle
        Circle largerCircle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println("Larger Circle's Area: " + largerCircle.getArea());

        // Finding larger cylinder
        Cylinder largerCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
        System.out.println("Larger Cylinder's Volume: " + largerCylinder.getVolume());

        // Testing ComparableCylinder
        ComparableCylinder compCylinder1 = new ComparableCylinder(3, 4);
        ComparableCylinder compCylinder2 = new ComparableCylinder(2, 6);
        ComparableCylinder largerCompCylinder = ComparableCylinder.max(compCylinder1, compCylinder2);
        System.out.println("Larger ComparableCylinder's Volume: " + largerCompCylinder.getVolume());

        // Testing Square implementing Colorable
        Square square = new Square();
        square.howToColor();
    }
}
