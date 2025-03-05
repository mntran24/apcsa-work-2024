public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public String toString(){
        return "Circle[...]";
    }
}
