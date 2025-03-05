import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        boolean success = false;
        while (!success) {
            try {
                Scanner num1 = new Scanner(System.in);
                System.out.println("Enter the first number");
                double number1 = num1.nextDouble();
                Scanner num2 = new Scanner(System.in);
                System.out.println("Enter the second number");
                double number2 = num2.nextDouble();
                double sum = number1 + number2;
                System.out.println("The sum of the two numbers is " + sum);
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a double");
            }
        }
    }
}