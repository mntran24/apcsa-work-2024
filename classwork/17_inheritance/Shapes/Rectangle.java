public class Rectangle extends Shape{
    public Rectangle(double h, double w){
        super(h, w);
    }
    public double getArea(){
        return this.getHeight()*this.getWidth();
    }
}
