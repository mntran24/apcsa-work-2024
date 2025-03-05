public class Rectangle{
    // private instance variables 
    private int width = 0;
    private int height = 0;

    // Constructor
    public Rectangle(int myWidth, int myHeight){
        width = myWidth;
        height = myHeight;
    }

    // Accessor methods
    public int getWidth() {
        return width;
      }
      public int getHeight() {
        return height;
      }

    // Get Setters methods
    public void setWidth(int newWidth) {
        width = newWidth;
      }
    public void setHeight(int newHeight) {
        height = newHeight;
      }

      // Other method{}
      public int calcArea(){
        return width * height;
      }
}
