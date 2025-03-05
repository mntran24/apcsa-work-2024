public class Driver{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5, 8);
        rec1.setHeight(9);
        System.out.println(rec1.getArea());
        Triangle tri1 = new Triangle(5, 10);
        tri1.setHeight(9);
        System.out.println(tri1.getArea());
    }
}
