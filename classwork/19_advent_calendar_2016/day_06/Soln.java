import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Soln {
    public static void main(String[] args) {
        try {
          System.out.println(new File("input.txt").getAbsoluteFile());
            File file = new File("input.txt");
            Scanner input = new Scanner(file);
            ArrayList<Character> pos1 = new ArrayList<Character>();
            ArrayList<Character> pos2 = new ArrayList<Character>();
            ArrayList<Character> pos3 = new ArrayList<Character>();
            ArrayList<Character> pos4 = new ArrayList<Character>();
            ArrayList<Character> pos5 = new ArrayList<Character>();
            ArrayList<Character> pos6 = new ArrayList<Character>();
            ArrayList<Character> pos7 = new ArrayList<Character>();
            ArrayList<Character> pos8 = new ArrayList<Character>();
            ArrayList<ArrayList<Character>> alllists = new ArrayList<>(Arrays.asList(pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8));
            while (input.hasNextLine()) {
              String line = input.nextLine();
              char[] linearr = line.strip().toCharArray();
              for (int i = 0;i<linearr.length;i++){
                alllists.get(i).add(linearr[i]);
              }
              // System.out.println(arr[row][col]);
            }
            for (int x = 0;x<alllists.size();x++){
              getLeastFreqChar(alllists.get(x));
            }
            input.close();//releases the file from your program
          } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
          }
    }
    public static char getLeastFreqChar(ArrayList<Character> listy){
      int low = 546;
      char freq = 'a';
      for (int i = 0;i<listy.size();i++){
        int curr = 0;
        for (int j = 0;j<listy.size();j++){
          if (listy.get(i)==listy.get(j)){
            curr++;
          }
        }
        if (curr<low){
          low = curr;
          freq = listy.get(i);
        }
      }
      System.out.println(freq);
      return freq;
    }
}
