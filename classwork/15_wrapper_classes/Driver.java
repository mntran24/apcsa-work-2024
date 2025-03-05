import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Currency cur = new Currency(12.45);
        System.out.println(cur.toString());
        System.out.println(cur.getDollars());
        System.out.println(cur.getCents());
        cur.setValue(13.34);
        System.out.println(cur.toString());

        Extremes num = new Extremes();
        Scanner inp = new Scanner(System.in);
        System.out.println("Guess the maximum Integer value: ");
        try{
            int guess = inp.nextInt();
            System.out.println("You were off by "+Math.abs(num.maxDiff(guess)));
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
        try{
            inp.nextLine();
            System.out.println("Guess the minimum Integer value: ");
            int guess = inp.nextInt();
            System.out.println("You were off by "+Math.abs(num.minDiff(guess)));
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
