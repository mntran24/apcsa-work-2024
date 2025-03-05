public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return Math.pow(this.getRadius(),2)*Math.PI*height;
    }
    @Override
    public double getArea(){
        return (2*this.getRadius()*Math.PI*height+2*super.getArea());
    }
    @Override
    public String toString(){
        return "Cylinder[...]";
    }
}
