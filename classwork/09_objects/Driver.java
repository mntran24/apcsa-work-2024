public class Driver{
    public static void main(String[]args){
        Rectangle rect = new  Rectangle(4, 7);
        
        //Can view and change the width
        System.out.println( rect.getWidth() );
        rect.setWidth(2);
        System.out.println( rect.getWidth() );

        //Can view and change the height
        System.out.println( rect.getHeight() );
        rect.setHeight(5);
        System.out.println( rect.getHeight() );

        //Calc. area
        System.out.println( rect.calcArea() ); 

    }
}
