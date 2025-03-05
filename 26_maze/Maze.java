import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maze{
    public static char[][] read() {
        try{
            File inp = new File("maze1.txt");
            Scanner sc = new Scanner(inp);
            ArrayList<char[]> temp = new ArrayList<char[]>();
            while(sc.hasNextLine()){
                temp.add(sc.nextLine().toCharArray());
            }
            char[][] maze = new char[temp.size()][temp.get(0).length];
            for (int i = 0;i<temp.size();i++){
                maze[i] = temp.get(i);
            }
            sc.close();
            return maze;
        }
        catch(Exception e){
            return new char[0][0];
        }
    }
    public static void printEach(char[][] arr){
        for(char[] ea:arr){
            System.out.println(Arrays.toString(ea));
        }
    }
    public static String toText(char[][] arr){
        String ret = "";
        for(char[] ea:arr){
            for(char e:ea){
                ret+=e;
            }
            ret+="\n";
        }
        return ret;
    }
    public static void main(String[] args) {
        char[][] test = read();
        printEach(test);
    }
}