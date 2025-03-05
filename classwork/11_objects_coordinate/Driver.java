//Naomi Steinmetz and Mai Tran

public class Driver {

  // Additional methods not shown

  public static double distance(Point a, Point b) {
    return Point.distance(a, b);
  }

  public static void main(String[] args) {
    Point point1 = new Point(4, 6);
    Point point2 = new Point(-2, 4);
    Point point3 = new Point();
    Point point4 = new Point(point2);
    System.out.println(distance(point1, point2)); //6.32
    System.out.println(Point.distance(point1, point2)); //6.32
    System.out.println(point1.distanceTo(point2)); //6.32
    System.out.println(point4.distanceTo(point2)); //0
    System.out.println(distance(point3, point4)); //4.47
    System.out.println(Point.distance(point1, point3)); //7.21
  }

}
/*
 * There are 3 different distance method called in the main method:
 * 1. distance(point1, point2)
 * 
 * 
 * This is implemented in this class, Driver, because it is called without the
 * name of another class.
 * This is static because it is called without the use of an object from another
 * class.
 * 
 * 
 * 2. Point.distance(point1, point2)
 * 
 * 
 * This is implemented in the class Point because it references the class Point
 * when called.
 * This is static because the method is called without the use of an object.
 * 
 * 
 * 3. point1.distanceTo(point2)
 * This is implemented in the class Point because when called, it references an
 * object from that class.
 * This is non-static because the method is called using an object, point1, from
 * the class Point.
 * 
 * For each of those methods respond the following questions:
 * 1. Where is the method implemented (which class)? Justify your answer.
 * 2. Is the method static or non-static? Justify your answer.
 */
