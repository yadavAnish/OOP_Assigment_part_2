package Q4;

abstract class GeometricObject implements Comparable<GeometricObject> {
    abstract double getArea();
    abstract double getVolume();

    // Implementing compareTo method to compare GeometricObjects based on volume
    public int compareTo(GeometricObject o) {
        if (this.getVolume() < o.getVolume()) {
            return -1;
        } else if (this.getVolume() > o.getVolume()) {
            return 1;
        } else {
            return 0;
        }
    }

    // max method to find the larger of two GeometricObjects
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
