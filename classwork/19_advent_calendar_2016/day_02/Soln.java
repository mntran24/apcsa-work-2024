import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Soln {
    public static void main(String[] args) {
        try {
          System.out.println(new File("test.txt").getAbsoluteFile());
            File file = new File("input.txt");
            Scanner input = new Scanner(file);
            int row = 2;
            int col = 0;
            String[][] arr = {{null,null,"1",null,null},{null,"2","3","4",null},{"5","6","7","8","9"},{null,"A","B","C",null},{null,null,"D",null,null}};
            while (input.hasNextLine()) {
              String line = input.nextLine();
              for (int i = 0;i<line.length();i++){
                if (line.charAt(i)=='U'&&row>=1){
                  if(arr[row-1][col]!=null){
                    row--;
                  }
                }
                else{
                    if (line.charAt(i)=='R'&&col<=3){
                        if(arr[row][col+1]!=null){
                          col++;
                        }
                    }
                    else{
                        if (line.charAt(i)=='D'&&row<=3){
                          if(arr[row+1][col]!=null){
                            row++;
                          }
                        }
                        else{
                            if(line.charAt(i)=='L'&&col>=1){
                              if(arr[row][col-1]!=null){
                                col--;
                              }
                            }
                        }
                    }
                }
                // System.out.println(arr[row][col]);
              }
              System.out.println(arr[row][col]);
            }
            input.close();//releases the file from your program
          } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
          }
    }
}
