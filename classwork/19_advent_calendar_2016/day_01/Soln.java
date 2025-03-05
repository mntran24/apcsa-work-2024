import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner; // Import the Scanner
public class Soln {
    public static void main(String[] args){
        try {
          // System.out.println(new File("input.txt").getAbsoluteFile());
            File file = new File("test.txt");
            Scanner input = new Scanner(file);
            int x = 0;
            int y = 0;
            while (input.hasNextLine()) {
              String line = input.nextLine();
              String[] dir = line.split(", ");
              int deg = 0;
              int max_x = 0;
              
              for (String di:dir){
                char turn = di.charAt(0);
                int steps = Integer.parseInt(di.substring(1));
                if (turn=='R'){
                    deg++;
                }
                else{
                    deg--;
                }
                if (Math.abs(deg%4)==0){
                  y+=steps;
                }
                else{
                  if (Math.abs(deg%4)==1){
                    x+=steps;
                  }
                  else{
                    if (Math.abs(deg%4)==2){
                      y-=steps;
                    }
                    else{
                      x-=steps;
                    }
                  }
                }
                System.out.println(x+", "+y);
              }
              System.out.println(x+", "+y);
            }
            System.out.println(Math.abs(x)+Math.abs(y));
            input.close();//releases the file from your program
          } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
          }
    }
}
