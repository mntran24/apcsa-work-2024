import java.util.Scanner;
public class NightOut{
    public static void main(String[] args){
        boolean success = false;
        while (!success) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("How much does dinner usually cost?");
                double d_price = input.nextDouble();
                System.out.println("How much is laser tag for one person?");
                double l_price = input.nextDouble();
                System.out.println("How much does a triple scoop cost?");
                double i_price = input.nextDouble();
                double total = d_price * 3 + l_price * 2 + i_price * 4/3;
                System.out.println("Dinner: $"+d_price);
                System.out.println("Laser Tag: $"+l_price);
                System.out.println("Ice cream: $"+i_price);
                System.out.println("Grand Total: $"+total);
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a double");
            }
        }
    }
}