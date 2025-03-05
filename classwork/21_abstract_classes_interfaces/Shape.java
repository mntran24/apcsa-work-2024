interface ShapeInterface {
   double getHeight();
   double getWidth();
   double getArea();
}

abstract class Shape implements ShapeInterface{
    private double height, width;
    public Shape(double h, double w){
        height = h;
        width = w;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double newh){
        height = newh;
    }
    public void setWidth(double neww){
        width = neww;
    }
    // public abstract double getArea();
}
