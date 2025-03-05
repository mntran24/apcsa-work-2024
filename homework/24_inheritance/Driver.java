public class Driver {
    public static void main(String[] args) {
        Circle circ1 = new Circle(2);
        System.out.println(circ1.getArea());
        System.out.println(circ1.getRadius());
        System.out.println(circ1.toString());

        Cylinder cyl1 = new Cylinder(2, 4);
        System.out.println(cyl1.getArea());
        System.out.println(cyl1.getHeight());
        System.out.println(cyl1.getVolume());
        System.out.println(cyl1.toString());
    }
}
