public class Point {
    // Instance variables

    private double x, y;

    // Constructors

    // Initialize this Point with the xVal and yVal parameters
    public Point(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }

    // Initialize this Point with other Point's values
    public Point(Point other) {
        x = other.getX();
        y = other.getY();
    }

    public Point() {
        x = 0;
        y = 0;
    }

    // Getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Print the coordinate like this "(5.0, 3.0)"

    public String toString() {
        String res = "(" + x + ", " + y + ")";
        return res;
    }

    /*
     * Write distance method
     */
    public static double distance(Point a, Point b) {
        double dist = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        return dist;
    }

    /*
     * The parameter list is different from distance method
     * Do not duplicate your code
     * Reuse code from prior methods
     */
    public double distanceTo(Point other) {
        double disty = Point.distance(this, other);
        return disty;
    }
}
