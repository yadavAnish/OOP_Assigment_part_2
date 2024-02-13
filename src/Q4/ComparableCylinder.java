package Q4;

// ComparableCylinder class extending Cylinder and implementing Comparable
class ComparableCylinder extends Cylinder implements Comparable<GeometricObject> {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    // Implementing compareTo method to compare cylinders based on volume
    public int compareTo(GeometricObject o) {
        if (o instanceof ComparableCylinder) {
            ComparableCylinder otherCylinder = (ComparableCylinder) o;
            if (this.getVolume() < otherCylinder.getVolume()) {
                return -1;
            } else if (this.getVolume() > otherCylinder.getVolume()) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    // max method to find the larger of two ComparableCylinders
    public static ComparableCylinder max(ComparableCylinder o1, ComparableCylinder o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
