import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Soln {
    public static void main(String[] args) {
        try {
          System.out.println(new File("input.txt").getAbsoluteFile());
            File file = new File("input.txt");
            Scanner input = new Scanner(file);
            int tot = 0;
            for (int x = 0;x<1599;x+=3) {
              // ArrayList<Integer> triangle = new ArrayList<Integer>();
              String line = input.nextLine();
              // System.out.println(line);
              String[] raw = line.strip().split("  ");
              ArrayList<Integer> triangle = getIntLengths(raw);
              String line2 = input.nextLine();
              // System.out.println(line2);
              String[] raw2 = line2.strip().split("  ");
              ArrayList<Integer> triangle2 = getIntLengths(raw2);
              String line3 = input.nextLine();
              // System.out.println(line3);
              String[] raw3 = line3.strip().split("  ");
              ArrayList<Integer> triangle3 = getIntLengths(raw3);
              for (int k = 0;k<triangle.size();k++){
                int side1 = triangle.get(k);
                int side2 = triangle2.get(k);
                int side3 = triangle3.get(k);
                // System.out.println(side1);
                // System.out.println(side2);
                // System.out.println(side3);
                if (side1+side2>side3&&side2+side3>side1&&side1+side3>side2){
                tot++;
                }
              }
            }
            System.out.println(tot);
            input.close();//releases the file from your program
          } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
          }
    }
    public static ArrayList<Integer> getIntLengths(String[] rawlengths){
      ArrayList<Integer> ret = new ArrayList<Integer>();
      for (String a:rawlengths){
        if (!a.equals("")){
          ret.add(Integer.parseInt(a.strip()));
        }
      }
      return ret;
    }
}
