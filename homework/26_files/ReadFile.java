import java.io.File;  // Import the File class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import the FileNotFoundException class to handle errors
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        try {
            String[][] fin = new String[4][4];
            File file = new File("2d.txt");
            Scanner input = new Scanner(file);
            int row = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] words = line.split(" ");
                fin[row] = words;
                row++;
            }
            for (String[] ligne:fin){
                for (String num:ligne){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            input.close();// releases the file from your program
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
