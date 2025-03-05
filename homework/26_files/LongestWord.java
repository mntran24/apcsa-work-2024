import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        try {
            File file = new File("my_text.txt");
            Scanner input = new Scanner(file);
            String ret = "";
            while (input.hasNextLine()) {
              String line = input.nextLine();
              String[] words = line.split(" ");
              int hi = 0;
              for (String word:words){
                int wd_length = 0;
                for (int i = 0;i<word.length();i++){
                  if (Character.isLetter(word.charAt(i))){
                    wd_length++;
                  }
                }
                if (wd_length>hi){
                  ret = word;
                  hi = wd_length;
                }
              }
            }
            System.out.println(ret);
            input.close();//releases the file from your program
          } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            // e.printStackTrace();
          }
    }
}
