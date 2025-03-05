import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {
        boolean success = false;
        while (!success) {
            try {
                Scanner inputT = new Scanner(System.in);
                System.out.println("Enter temperature in Fahrenheit");
                double tempF = inputT.nextDouble();
                double tempC = (tempF - 32) / 1.8;
                System.out.println("Temperature in Celsius is " + tempC);
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a double");
            }
        }
    }
}